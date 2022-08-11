package network;

import java.util.HashMap;
import java.util.logging.Handler;

public class MessagingQueue {
    public static final long DEFAULT_MESSAGING_TIMEOUT = 3000;

    private String label;
    private HashMap<String, WaitingGroup> handlers;

    public MessagingQueue(String label) {
        this.label = label;
    }

    public void enqueue(String requestId, RequestHandler handler) {
        this.enqueueWithTimeout(requestId, handler, DEFAULT_MESSAGING_TIMEOUT);
    }

    public synchronized void enqueueWithTimeout(String requestId, RequestHandler handler, long timeout) {
        if(handlers.containsKey(requestId)) {
            System.err.println(String.format("[MQ: %s] Trying to request as same id: %s", this.label, requestId));
            return;
        }

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(timeout);
                handler.onTimeout();
                this.finalizeWaitingGroup(requestId);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();

        long requestTime = System.currentTimeMillis();
        WaitingGroup waitingGroup = new WaitingGroup(thread, handler, requestTime);
        handlers.put(requestId, waitingGroup);
    }

    // call when response has received
    public void dequeue(String requestId, byte[] payload) {
        WaitingGroup waitingGroup = this.finalizeWaitingGroup(requestId);
        waitingGroup.handler.onSuccess(payload);
    }

    private synchronized WaitingGroup finalizeWaitingGroup(String requestId) {
        WaitingGroup waitingGroup = handlers.remove(requestId);
        waitingGroup.waitingThread.interrupt();
        return waitingGroup;
    }
}