package audioplayer.system.decoder.flac;

import audioplayer.system.decoder.AudioDecoder;
import audioplayer.model.MediaFormat;

public class FLACDecoder extends AudioDecoder {

    public FLACDecoder(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] decode() {
        System.out.println("Decoding FLAC audio format...");
        return getAudioData();
    }
}