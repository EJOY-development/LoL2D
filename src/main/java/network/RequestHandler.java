package network;

public interface RequestHandler {
    public void onSuccess();
    public void onError();
    public void onTimeout();
}
