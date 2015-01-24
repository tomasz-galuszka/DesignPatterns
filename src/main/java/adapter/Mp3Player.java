package adapter;

public class Mp3Player implements AdvencedMediaPlayer {
    @Override
    public void playVlc() {
        // not supported
    }

    @Override
    public void playMp3() {
        System.out.println("Playing MP3.");
    }
}
