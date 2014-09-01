/*почитать зачем нужен StringBuilder. Написать пример сложения 100 строк в цикле при помощи StringBuilder.

 */


public class Main {

    public static void main(String[] args) {

        StringBuilder string = new StringBuilder();
        String inputString = "Test_String ";
        for (int i = 1; i <= 100 ; i++) {
            string.append(inputString);
        }

    }

}
