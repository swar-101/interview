package audioplayer.factory.flac;

import audioplayer.factory.AudioFactory;
import audioplayer.model.MediaFormat;
import audioplayer.system.decoder.AudioDecoder;
import audioplayer.system.decoder.flac.FLACDecoder;
import audioplayer.system.player.AudioPlayer;
import audioplayer.system.player.flac.FLACPlayer;
import audioplayer.system.processor.AudioProcessor;
import audioplayer.system.processor.flac.FLACProcessor;

public class FLACFactory extends AudioFactory {

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume, playbackRate);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new FLACProcessor(audioData);
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }
}