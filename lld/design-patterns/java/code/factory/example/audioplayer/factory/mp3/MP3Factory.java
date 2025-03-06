package audioplayer.factory.mp3;

import audioplayer.factory.AudioFactory;
import audioplayer.model.MediaFormat;
import audioplayer.system.decoder.AudioDecoder;
import audioplayer.system.decoder.mp3.MP3Decoder;
import audioplayer.system.player.AudioPlayer;
import audioplayer.system.player.mp3.MP3Player;
import audioplayer.system.processor.AudioProcessor;
import audioplayer.system.processor.mp3.MP3Processor;

public class MP3Factory extends AudioFactory {

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume, playbackRate);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new MP3Processor(audioData);
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }
}