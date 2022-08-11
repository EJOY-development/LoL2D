package utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Crypto {
    public static String sha256(String cypher) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(cypher.getBytes());
        return Bytes.bytes2Hex(digest.digest());
    }
}
