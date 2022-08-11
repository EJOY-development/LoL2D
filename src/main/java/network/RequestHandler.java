package network;

public interface RequestHandler {
    public void onSuccess(byte[] payload);
    public void onError();
    public void onTimeout();
}
