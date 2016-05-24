

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

@Deprecated
public class Music {

    public static synchronized void playWav(final String url) {
    new Thread(new Runnable() {
            // The wrapper thread is unnecessary, unless it blocks on the
            // Clip finishing; see comments.
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                            Main.class.getResourceAsStream("/path/to/sounds/" + url));
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }


    public void playMp3(String filename) {
        String strFilename = filename;
        File soundFile;
        try {
            soundFile = new File("");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

//        try {
//
//        }
    }

}
