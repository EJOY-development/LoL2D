package network;

public class WaitingGroup {
    public Thread waitingThread;
    public RequestHandler handler;
    private long requestTime;

    public WaitingGroup(Thread waitingThread, RequestHandler handler, long requestTime) {
        this.waitingThread = waitingThread;
        this.handler = handler;
        this.requestTime = requestTime;
    }

    public long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(long requestTime) {
        this.requestTime = requestTime;
    }
}