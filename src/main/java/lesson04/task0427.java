package lesson04;

/**
 * Положительное число
 * Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
 * <p>
 * Примеры:
 * а) при вводе чисел
 * -4
 * 6
 * 6
 * получим вывод
 * 2
 * <p>
 * б) при вводе чисел
 * -6
 * -6
 * -3
 * получим вывод
 * 0
 * в) при вводе чисел
 * 0
 * 1
 * 2
 * получим вывод
 * 2
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Программа должна выводить количество положительных чисел в исходном наборе.
 * •	Если положительных чисел нет, программа должна вывести "0".
 * •	Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0427 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int sumPositNumb = 0;

        if ( a > 0)
            sumPositNumb++;
        if (b > 0)
            sumPositNumb++;
        if (c > 0)
            sumPositNumb++;

            System.out.println(sumPositNumb);
    }
}
