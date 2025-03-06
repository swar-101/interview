package audioplayer.system.processor.mp3;

import audioplayer.model.MediaFormat;
import audioplayer.system.processor.AudioProcessor;

public class MP3Processor extends AudioProcessor {

    public MP3Processor(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public byte[] process() {
        System.out.println("Processing MP3 audio format...");
        return getAudioData();
    }
}