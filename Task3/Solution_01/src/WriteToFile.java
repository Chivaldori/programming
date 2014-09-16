import java.io.*;
import java.util.ArrayList;

public class WriteToFile {
    public static void write(String fileName, ArrayList<String> array) {
        File file = new File(fileName);

        try {
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter out = new FileWriter(file.getAbsoluteFile());

            try {
                for (String s : array) {
                    out.write(s + "\n");
                }

            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
