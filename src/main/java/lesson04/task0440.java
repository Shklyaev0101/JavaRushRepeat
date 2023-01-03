package lesson04;

/**
 * Как-то средненько
 * Ввести с клавиатуры три числа, вывести на экран среднее из них.
 * Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить среднее из трех чисел.
 * •	Если все числа равны, вывести любое из них.
 * •	Если два числа из трех равны, вывести любое из двух.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0440 {
    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println(a);
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println(b);
        } else if ((c > a && c < b) || (c < a && c > b)) {
            System.out.println(c);
        } else if ((a == b) && b == c) {
            System.out.println(c);
        } else if (a == b && a != c || b != c) {
            System.out.println(a);
        } else if (a == c && a != b || c != b) {
            System.out.println(c);
        } else if (b == c && b != a || c != a) {
            System.out.println(b);
        }
    }
}
