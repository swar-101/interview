package audioplayer;

import audioplayer.factory.AudioFactory;
import audioplayer.factory.flac.FLACFactory;
import audioplayer.factory.mp3.MP3Factory;
import audioplayer.system.decoder.AudioDecoder;
import audioplayer.system.player.AudioPlayer;
import audioplayer.system.processor.AudioProcessor;

public class Client {
    public static void main(String[] args) {
        AudioFactory mp3Factory = new MP3Factory();

        AudioDecoder mp3Decoder = mp3Factory.createAudioDecoder(new byte[]{23, 3, 2, 4, 4});
        AudioProcessor mp3Processor = mp3Factory.createAudioProcessor(new byte[]{23, 3, 2, 4, 4});
        AudioPlayer mp3Player = mp3Factory.createAudioPlayer(70, 1.0);

        mp3Decoder.decode();
        mp3Processor.process();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        AudioFactory flacFactory = new FLACFactory();

        AudioDecoder flacDecoder = flacFactory.createAudioDecoder(new byte[]{23, 3, 2, 6, 4});
        AudioProcessor flacProcessor = flacFactory.createAudioProcessor(new byte[]{23, 113, 2, 4, 4});
        AudioPlayer flacPlayer = flacFactory.createAudioPlayer(65, 1.2);

        flacDecoder.decode();
        flacProcessor.process();

        flacPlayer.play();
        flacPlayer.pause();
        flacPlayer.stop();
    }
}   