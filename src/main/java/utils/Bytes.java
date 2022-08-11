package utils;

import java.nio.charset.StandardCharsets;

public class Bytes {
    private static final byte[] HEX_CHARS = "0123456789ABCDEF".getBytes(StandardCharsets.US_ASCII);

    public static String bytes2Hex(byte[] bytes) {
        byte[] hexBytes = new byte[bytes.length * 2];
        for(int i=0; i<bytes.length; i++) {
            int b = bytes[i] & 0xFF;
            hexBytes[i * 2] = HEX_CHARS[b >>> 4];
            hexBytes[i * 2 + 1] = HEX_CHARS[b & 0x0f];
        }
        return new String(hexBytes);
    }
}