package lesson04;

/**
 * Максимум четырех чисел
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них.
 * Если числа равны между собой, необходимо вывести любое.
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить на экран максимальное из четырёх чисел.
 * •	Если максимальных чисел несколько, необходимо вывести любое из них.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0418 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        String sD = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int d = Integer.parseInt(sD);
        int max = (Math.max(Math.max(a,b), Math.max(c,d)));

        if((a > b & a > c & a > d)) {
            System.out.println(a);
        } else if (b > a & b > c & b > d) {
            System.out.println(b);
        } else if (c > a & c > b & c > d) {
            System.out.println(c);
        }else if (d > a & d > b & d > c) {
            System.out.println(d);
        } else
            System.out.println(max);
    }
}
