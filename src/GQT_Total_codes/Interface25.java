package GQT_Total_codes;

interface Encryptable {
    void encrypt(String data);
}

interface Decryptable {
    void decrypt(String data);
}

class EncryptionAlgorithm implements Encryptable {
    public void encrypt(String data) {
        System.out.println("Algorithm Encrypted: " + data.toUpperCase());
    }
}

class DecryptionAlgorithm implements Decryptable {
    public void decrypt(String data) {
        System.out.println("Algorithm Decrypted: " + data.toLowerCase());
    }
}

public class Interface25 {
    public static void main(String[] args) {
        EncryptionAlgorithm enc = new EncryptionAlgorithm();
        enc.encrypt("hello");

        DecryptionAlgorithm dec = new DecryptionAlgorithm();
        dec.decrypt("HELLO");
    }
}
