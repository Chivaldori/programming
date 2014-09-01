/*дана строка:
String text = ",     Миша, Коля, Сергей,Толян  ";
получить массив имен
подсказка - использовать встроенные функции у объекта String - Split() и Trim().
 */
public class Main {

    public static void main(String[] args) {

        String text = ",     Миша, Коля, Сергей,Толян  ";
        String[] out = text.trim().split(" ");
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }


    }

}
