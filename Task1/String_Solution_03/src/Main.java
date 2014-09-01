/*Есть строка

String text = 	"Через час отсюда в чистый переулок" +
                "вытечет по человеку ваш обрюзгший жир," +
                "а я вам открыл столько стихов шкатулок," +
                "я - бесценных слов мот и транжир.";

а) Найти количество букв 'о' в ней.
б) После слова "отсюда" вставить слово "или два". Заменить слов "стихов" на "мраморных".
Вывести на консоль в UPPERCASE'е, прочитать с выражением, в стиле Маяковского.
 */

public class Main {

    public static void main(String[] args) {

        String text = 	"Через час отсюда в чистый переулок " +
                "вытечет по человеку ваш обрюзгший жир, " +
                "а я вам открыл столько стихов шкатулок, " +
                "я - бесценных слов мот и транжир.";

        String word1 = "отсюда";
        String word2 = " или два";
        String word3 = "стихов";
        String word4 = "мраморных";
        char ch = 'о';
        StringBuilder buff = new StringBuilder();

        System.out.println("Исходный текст");
        System.out.println();
        System.out.println(text);
        System.out.println();


        char[] charArr = text.toCharArray();
        int countO = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ch) countO = countO + 1;
        }
        // можно было не приводить врукопашную в массив char, в объекте String и так можно достучаться к i-тому символу:
        /*for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                // и использовать операцию постинкремента (++) - выглядит покороче:
                countO++;
            }
        }*/

        System.out.println("Количество букв - " + ch + ": " + countO);
        System.out.println();

        text = text.replace(word3, word4);

        buff.append(text);
        int indOffset = buff.indexOf(word1);
        int lengthOffSet = word1.length();
        buff.insert(indOffset + lengthOffSet, word2);
        text = buff.toString();
        System.out.println(text.toUpperCase());

    }
}
