package network;

import core.Context;
import service.exceptions.RequestFailedException;

import java.util.UUID;

public class Requests {
    // return uuid of request as request id
    public static String request(Beacon beacon, byte[] payload, RequestHandler handler) throws RequestFailedException {
        String requestId = createRequestId();
        beacon.request(payload, handler);
        Context.RequestsMessagingQueue.enqueue(requestId, handler);
        return requestId;
    }

    private static String createRequestId() {
        return UUID.randomUUID().toString();
    }
}