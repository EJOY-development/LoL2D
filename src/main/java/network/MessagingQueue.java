package network;

import java.util.HashMap;
import java.util.logging.Handler;

public class MessagingQueue {
    private Thread queueingThread;
    private boolean stopSig = true;
    private HashMap<String, WaitingGroup> handlers;

    public MessagingQueue() {
    }

    public void run() {
        this.stopSig = false;

    }

    public void enqueue(String requestId, RequestHandler handler) {
//        if(handlers.containsKey(requestId)) {
//            System.err.println("Trying to request as same id: " + requestId);
//            return;
//        }
//        Thread t = new Thread(() -> {
//            Thread.sleep();
//        });
//        handlers.put(requestId, handler);
    }

    public void interrupt() {
        if(this.queueingThread.isInterrupted()) return;
        this.stopSig = true;
        this.queueingThread.interrupt();
    }
}