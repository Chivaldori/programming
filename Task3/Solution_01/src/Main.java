import java.io.*;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) throws IOException {
            // странновато выглядят пути с обратными слешами. по-линуксовски
            String sourceFileNameFull = "C://GIT.REPO/Task3/full.txt";
            String destFileNameResult = "C://GIT.REPO/Task3/result.txt";
            String sourceFileNamePart = "C://GIT.REPO/Task3/part.txt";

            //ArrayList<String> arrInFull = new ArrayList<String>(ReadFromFile.read(sourceFileNameFull));
            //ArrayList<String> arrInPart = new ArrayList<String>(ReadFromFile.read(sourceFileNamePart));
            // Создаёшь один объект списка, а в качестве параметра его конструктора передаешь ему другой объект списка,
            // созданный в методе ReadFromFile. Только лишнюю память мучаешь. Метод и так создаёт и возвращает список, так что нужно было написать так:
            ArrayList<String> arrInFull = ReadFromFile.read(sourceFileNameFull);
            ArrayList<String> arrInPart = ReadFromFile.read(sourceFileNamePart);

            ArrayList<String> arrOut = new ArrayList<String>();

            // У меня тут программа повалилась по NullReferenceException, см. комментарии в методе ReadFromFile()
            for (String n : arrInFull) {
                    if (!arrInPart.contains(n)) arrOut.add(n);
            }

            WriteToFile.write(destFileNameResult, arrOut);
        }
}
