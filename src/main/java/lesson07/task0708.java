package lesson07;

/**
 * Удалить и вставить
 *
 * 1. Создай список строк.
 * 2. Добавь в него 5 строк с клавиатуры.
 * 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
 * 4. Используя цикл выведи содержимое результирующего списка на экран,
 *    каждое значение с новой строки.
 *
 * Требования:
 * •	Объяви переменную типа список строк и сразу проинициализируй ee.
 * •	Программа должна считывать 5 строк с клавиатуры.
 * •	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
 * •	Программа должна выводить список на экран, каждое значение с новой строки.
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task0708 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String s = (reader.readLine());
            list.add (0, s);
        }

        for (int i = 0; i < 13; i++) {
            list.add (0, list.get(4));
            list.remove(5);

            for (int j = 0; j < 5; j++) {
                System.out.println(list.get(j));
            }
        }
    }
}
