import java.io.File;

/**
 * Created by ma039102 on 5/23/2016.
 */
@Deprecated
public class FileCreation {
    public void createFile(String filename) {
        try {
            File file = new File(filename);
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
