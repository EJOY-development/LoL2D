package network;

public class WaitingGroup {
    public Thread waitingThread;
    public RequestHandler handler;

    public WaitingGroup(Thread waitingThread, RequestHandler handler) {
        this.waitingThread = waitingThread;
        this.handler = handler;
    }
}