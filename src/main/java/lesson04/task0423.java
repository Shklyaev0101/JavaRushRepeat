package lesson04;

/**
 * Три числа
 * Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
 * Вывести на экран порядковый номер числа, отличного от остальных.
 *
 * Пример для чисел 4 6 6:
 * 1
 *
 * Пример для чисел 6 6 3:
 * 3
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна использовать команды System.out.println() или System.out.print().
 * •	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
 * •	Если все числа разные, ничего не выводить.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0423 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a != b & b == c) {
            System.out.println(1);
        } else if (b != a & a == c) {
            System.out.println(2);
        } else if (c != a & a == b) {
            System.out.println(3);
        }
    }
}
