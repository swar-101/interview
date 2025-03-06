package audioplayer.system.player.flac;

import audioplayer.model.MediaFormat;
import audioplayer.system.player.AudioPlayer;

public class FLACPlayer extends AudioPlayer {

    public FLACPlayer(int volume, double playbackRate) {
        super(volume, playbackRate);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public void play() {
        System.out.println("Playing FLAC audio.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing FLAC audio.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping FLAC audio.");
    }
}