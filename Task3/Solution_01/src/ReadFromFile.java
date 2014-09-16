import java.io.*;
import java.util.ArrayList;

public class ReadFromFile {

    public static ArrayList<String> read(String fileName) throws FileNotFoundException {
        ArrayList<String> arrStr = new ArrayList<String>();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("Файл не существует");
            return null;
        }

        try {
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));

            try {
                String s;
                while ((s = in.readLine()) != null) {
                    arrStr.add(s);
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        return arrStr;
    }
}
