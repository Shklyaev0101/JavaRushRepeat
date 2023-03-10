package lesson07;

/**
 * Удваиваем слова
 *
 * 1. Введи с клавиатуры 10 слов в список строк.
 *
 * 2. Метод doubleValues должен удваивать слова по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 *
 * 3. Выведи результат на экран, каждое значение с новой строки.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Считай 10 строк с клавиатуры и добавь их в список.
 * •	Метод doubleValues должен удваивать элементы списка по принципу "альфа",
 *      "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
 * •	Выведи получившийся список на экран, каждый элемент с новой строки.
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task0711 {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i = i + 2) {
            list.add(i, list.get(i));
        }
        return list;
    }
}
