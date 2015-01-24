package adapter;

public class VlcPlayer implements AdvencedMediaPlayer {
    @Override
    public void playVlc() {
        System.out.println("Playing VLC.");
    }

    @Override
    public void playMp3() {
        // not supported
    }
}
