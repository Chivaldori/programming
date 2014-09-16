import java.io.*;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) throws IOException {
            String sourceFileNameFull = "C://GIT.REPO/Task3/full.txt";
            String destFileNameResult = "C://GIT.REPO/Task3/result.txt";
            String sourceFileNamePart = "C://GIT.REPO/Task3/part.txt";

            ArrayList<String> arrInFull = new ArrayList<String>(ReadFromFile.read(sourceFileNameFull));
            ArrayList<String> arrInPart = new ArrayList<String>(ReadFromFile.read(sourceFileNamePart));
            ArrayList<String> arrOut = new ArrayList<String>();

            for (String n : arrInFull) {
                    if (!arrInPart.contains(n)) arrOut.add(n);
            }

            WriteToFile.write(destFileNameResult, arrOut);
        }
}
