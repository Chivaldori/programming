import java.io.*;
import java.util.ArrayList;

public class ReadFromFile {

    // вот метод, который можно вызывать вместо твоего read, и он схавает русскую кодировку.
    // на stackOverflow нашёл по первой ссылке.
    public static ArrayList<String> readCyrillic(String fileName) throws IOException {
        ArrayList<String> arrStr = new ArrayList<String>();

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Файл не существует");
            System.exit(0);
        }

        DataInputStream in = new DataInputStream(new FileInputStream(file));
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in,"windows-1251"));
            try {
                String s;
                while ((s = br.readLine()) != null) {
                    arrStr.add(s);
                }
            } finally {
                br.close();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return arrStr;
    }

    public static ArrayList<String> read(String fileName) throws FileNotFoundException {
        ArrayList<String> arrStr = new ArrayList<String>();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("Файл не существует");
            // опасный код. От твоего метода будут ожидать, что он вернёт объект списка, а в определённых случаях он возвращает null.
            // Так что нужно либо тут возвращать пустой список, либо во всех местах использования метода делать проверку объекта на null,
            // что, как бы, тоже быстродействию не способствует. В данном примере следовало вывести сообщение и завершить программу.
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
