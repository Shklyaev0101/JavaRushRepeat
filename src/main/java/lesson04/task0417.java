package lesson04;

/**
 * Минимум двух чисел
 * Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
 * Если два числа равны между собой, необходимо вывести любое.
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить на экран минимальное из двух целых чисел.
 * •	Если два числа равны между собой, необходимо вывести любое.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0417 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);

        if (a < b) {
            System.out.println(a);
        } else if (a > b) {
            System.out.println(b);
        } else if (a == b) {
            System.out.println(a | b);
        }
    }
}
