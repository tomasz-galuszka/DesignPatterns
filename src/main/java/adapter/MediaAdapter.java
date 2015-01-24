package adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvencedMediaPlayer mediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equals("VLC")) {
            this.mediaPlayer = new VlcPlayer();
        } else if (audioType.equals("MP3")) {
            this.mediaPlayer = new Mp3Player();
        }
    }

    @Override
    public void play(String type) {
        if (type.equals("VLC")) {
            this.mediaPlayer.playVlc();
        } else if(type.equals("MP3")) {
            this.mediaPlayer.playMp3();
        }
    }
}
