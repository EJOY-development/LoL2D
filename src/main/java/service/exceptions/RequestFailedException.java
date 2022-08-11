package service.exceptions;

public class RequestFailedException extends Exception {
    public RequestFailedException(String err) {
        super("Failed to send request: " + err);
    }
}
