import java.io.*;

/**
 * Created by ma039102 on 5/23/2016.
 */

public class FileCreation {
    public void createFile(String filename) {
        try {
            File file = new File(filename);
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String filename, String toBeWritten) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(filename), "utf-8"))) {
            writer.write(toBeWritten);
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String filename) {
        try {
            String line = null;
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
