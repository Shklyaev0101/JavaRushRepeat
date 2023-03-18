package lesson04;

/**
 * Хорошего много не бывает
 * Ввести с клавиатуры строку и число N больше 0.
 * Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
 *
 * Пример ввода:
 * абв
 * 2
 *
 * Пример вывода:
 * абв
 * абв
 *
 * Требования:
 * •	Программа должна считывать текст c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Каждое значение должно быть выведено с новой строки.
 * •	Программа должна выводить на экран строку N раз.
 * •	В программе должен использоваться цикл while.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0431 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int N = Integer.parseInt(reader.readLine());

        int i = 0;
        while (i < N) {
            System.out.println(s);
            i++;
        }
    }
}
