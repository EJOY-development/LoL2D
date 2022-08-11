package network;

import service.exceptions.RequestFailedException;

import java.util.UUID;

public class Requests {
    // return uuid of request as request id
    public static String request(Beacon beacon, byte[] payload) throws RequestFailedException {
        String requestId = createRequestId();
//        beacon.request();
        return requestId;
    }

    private static String createRequestId() {
        return UUID.randomUUID().toString();
    }
}