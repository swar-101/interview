package audioplayer.system.processor.flac;

import audioplayer.model.MediaFormat;
import audioplayer.system.processor.AudioProcessor;

public class FLACProcessor extends AudioProcessor {

    public FLACProcessor(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] process() {
        System.out.println("Processing FLAC audio format...");
        return getAudioData();
    }
}