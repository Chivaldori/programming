/*дан массив:
String[] array = { "Олег", "Яша", "Маша", "Игорь", "Вася", "Провокация", "+", "Человеконенавистничество", "Дилема"};
Пройтись по элементам массива строк при помощи foreach, вывести на консоль только те строки, длинна которых более 3 символов
 */

public class Main {

    public static void main(String[] args) {

        String[] array = { "Олег", "Яша", "Маша", "Игорь", "Вася", "Провокация", "+", "Человеконенавистничество", "Дилема"};
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength; i++) {
                if (array[i].length() > 3) System.out.println(array[i]);
        }


    }

}
