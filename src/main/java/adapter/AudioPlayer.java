package adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType) {

        if (audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP3")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType);
        }

    }
}
