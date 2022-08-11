package network;

public interface Beacon {
    void request(byte[] payload, RequestHandler handler);
}
