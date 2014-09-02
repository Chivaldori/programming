/*почитать зачем нужен StringBuilder. Написать пример сложения 100 строк в цикле при помощи StringBuilder.

 */


public class Main {

    public static void main(String[] args) {

        // очень плохо названа переменная string. почти как тип String, которым она даже не является.
        // если кода будет больше - легко запутаться

        // Принял. Согласен.

        StringBuilder string = new StringBuilder();
        String inputString = "Test_String ";
        for (int i = 1; i <= 100 ; i++) {
            string.append(inputString);
        }

        // ну и вывести результат тогда уже

        // не было в задании
        System.out.println(string.toString());
    }

}
