//import java.io.*;
//
//public class FileCreation {
//    public void createFile(String filename) {
//        try {
//            File file = new File(filename);
//            file.createNewFile();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void writeToFile(String filename, String toBeWritten) {
//        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
//                new FileOutputStream(filename), "utf-8"))) {
////            writer.write(toBeWritten);
//        } catch (Exception e ) {
//            e.printStackTrace();
//        }
//    }
//
//    public void readFromFile(String filename) {
//        //reads and prints the file.
//        try {
//            String line = null;
//            FileReader fileReader = new FileReader(filename);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void saveToFile(String filename, String toSave) {
//        //reads and then saves to a file.
//        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
//                new FileOutputStream(filename), "utf-8"))) {
//            writer.write(toSave);
//        } catch (Exception e ) {
//            e.printStackTrace();
//        }
//    }
//}
