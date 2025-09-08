package GQT_Total_codes;
interface Sendable {
    void send(String msg);
}

interface Receivable {
    void receive(String msg);
}

class Transmitter implements Sendable {
    public void send(String msg) { System.out.println("Sending: " + msg); }
}

class Receiver implements Receivable {
    public void receive(String msg) { System.out.println("Received: " + msg); }
}

public class Interface23 {
    public static void main(String[] args) {
        Transmitter t = new Transmitter();
        t.send("Hello World!");

        Receiver r = new Receiver();
        r.receive("Hello World!");
    }
}