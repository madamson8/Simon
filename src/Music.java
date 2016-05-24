import java.io.*;
import sun.audio.*;


public class Music {
    public void playMP3(String MusicFile)  {
        try {
            // open the sound file as a Java input stream
            InputStream in = new FileInputStream(MusicFile);

            // create an audiostream from the inputstream
            AudioStream audioStream = new AudioStream(in);

            // play the audio clip with the audioplayer class
            AudioPlayer.player.start(audioStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
