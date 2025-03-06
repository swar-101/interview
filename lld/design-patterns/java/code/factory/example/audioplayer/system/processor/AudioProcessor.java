package audioplayer.system.processor;

import audioplayer.model.MediaFormat;

public abstract class AudioProcessor {

    public byte[] audioData;

    public AudioProcessor(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();
    public abstract byte[] process();
}
