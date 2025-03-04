package audioplayer.factory;

import audioplayer.model.MediaFormat;
import audioplayer.system.decoder.AudioDecoder;
import audioplayer.system.player.AudioPlayer;
import audioplayer.system.processor.AudioProcessor;

public abstract class AudioFactory {
    public abstract AudioPlayer createAudioPlayer(int volume, double playbackRate);
    public abstract AudioProcessor createAudioProcessor(byte[] audioData);
    public abstract AudioDecoder createAudioDecoder(byte[] audioData);
    public abstract MediaFormat supportsFormat();
}