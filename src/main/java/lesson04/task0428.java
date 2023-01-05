package lesson04;

/**
 * Положительные и отрицательные числа
 * Ввести с клавиатуры три целых числа.
 * Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
 * в следующем виде:
 * "количество отрицательных чисел: а", "количество положительных чисел: б",
 * где а, б - искомые значения.
 *
 * Пример:
 * а) при вводе чисел
 * 2
 * 5
 * 6
 * получим вывод
 * количество отрицательных чисел: 0
 * количество положительных чисел: 3
 *
 * Пример:
 * б) при вводе чисел
 * -2
 * -5
 * 6
 * получим вывод
 * количество отрицательных чисел: 2
 * количество положительных чисел: 1
 *
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить количество отрицательных чисел в исходном наборе.
 * •	Программа должна выводить количество положительных чисел в исходном наборе.
 * •	Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
 * •	Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
 * •	Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0428 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int negNumb = 0;
        int positNumb = 0;

        if (a > 0) {
            positNumb++;
        }
        if (b > 0) {
            positNumb++;
        }
        if (c > 0) {
            positNumb++;
        }
        if (a < 0) {
            negNumb++;
        }
        if (b < 0) {
            negNumb++;
        }
        if (c < 0) {
            negNumb++;
        }
        System.out.println("количество отрицательных чисел: " + negNumb);
        System.out.println("количество положительных чисел: " + positNumb);
    }
}