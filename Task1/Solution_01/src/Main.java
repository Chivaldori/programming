
//        В цикле while вывести на консоль только нечетные числа от 0 до 76.


public class Main {

    public static void main(String[] args) {

        // зачем эта строка?
        System.out.println(0);
        int j = 1;
        while (j < 77) {
            if (j % 2 != 0)
                System.out.println(j);
            j++;
        }


        // вот ещё пример решения через for:
        for (int i = 1; i <= 76; i+=2) {
            System.out.println(i);
        }


//        for (int i = 1; i <= 100; i++) {
//            if ((i % 2) == 0)
//                System.out.println(i);

//        }


    }
}
