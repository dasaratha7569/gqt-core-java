package GQT_Total_codes;
interface Playable {
    void play();
}

interface Recordable {
    void record();
}

class MusicPlayer implements Playable {
    public void play() { System.out.println("Playing music..."); }
}

class Recorder implements Recordable {
    public void record() { System.out.println("Recording sound..."); }
}

public class Interface19 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();

        Recorder recorder = new Recorder();
        recorder.record();
    }
}