package lesson04;

/**
 * Существет ли пара
 * Ввести с клавиатуры три целых числа. Определить,
 * имеется ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел.
 * Если все три числа равны между собой, то вывести все три.
 * <p>
 * Примеры:
 * а) при вводе чисел
 * 1
 * 2
 * 2
 * получим вывод
 * 2 2
 * <p>
 * б) при вводе чисел
 * 2
 * 2
 * 2
 * получим вывод
 * 2 2 2
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна содержать System.out.println() или System.out.print()
 * •	Если два числа равны между собой, необходимо вывести числа на экран.
 * •	Если все три числа равны между собой, необходимо вывести все три.
 * •	Если нет равных чисел, ничего не выводить.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0416 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        if ((a == b) & (a != c) & (b != c)) {
            System.out.println(a + " " + b);
        } else if ((a == c) & (a != b) & (c != b)) {
            System.out.println(a + " " + c);
        } else if ((b == c) & (b != a) & (a != c)) {
            System.out.println(b + " " + c);
        } else if ((a == c) & (a == b) & (a == c)) {
            System.out.println(a + " " + b + " " + c);
        }
    }
}
