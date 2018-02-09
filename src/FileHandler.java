import java.io.*;

public class FileHandler {
    public void writeToFile(String[] strings, String path) {
        // Create it by creating a File file to a FileOutputStream then to a OutputStreamWriter
        try {
            File file = new File(path);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(strings);
            oos.close();
        } catch (FileNotFoundException eFNF) {

        } catch (IOException eIO) {

        }

        // Stream write the text to the file

        // Remember to close the Stream
    }

    public String[] readFromFile(String path) {
         String[] toReturn = new String[11];
        // Create a read stream from a file by a File and FileInputStream
        try {
            FileInputStream fis = new FileInputStream(new File(path));
            ObjectInputStream ois = new ObjectInputStream(fis);
            toReturn = (String[]) ois.readObject();
            ois.close();
        } catch (Exception eFNF) {

        }

        return toReturn;
    }
}
