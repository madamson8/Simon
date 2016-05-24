import java.io.*;
import sun.audio.*;
@Deprecated
public class Music {
    public static void main(String[] args) throws Exception {
                // open the sound file as a Java input stream
                String gongFile = "C:/Users/hb015507/IdeaProjects/Simon/src/Resources/40_smith_wesson_8x_gunshot-mike-koenig.wav";
                InputStream in = new FileInputStream(gongFile);

                // create an audiostream from the inputstream
                AudioStream audioStream = new AudioStream(in);

                // play the audio clip with the audioplayer class
                AudioPlayer.player.start(audioStream);
    }
}
