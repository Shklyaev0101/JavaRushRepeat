package lesson04;

/**
 * Сортировка трех чисел
 *
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания.
 * Выведенные числа должны быть разделены пробелом.
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить числа на экран.
 * •	Программа должна выводить три числа разделенных пробелами.
 * •	Программа должна выводить числа в порядке убывания.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0443 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        int middle = (a + b + c) - (min + max);

        System.out.println(max + " " + middle + " " + min);
    }
}
