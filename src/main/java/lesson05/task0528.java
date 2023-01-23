package lesson05;

/**
 * Совершенствуем функциональность
 *
 * Текущая реализация: Программа считывает два числа с клавиатуры и выводит минимальное из них на экран.
 * Новая задача: Программа считывает пять чисел с клавиатуры и выводит минимальное из них на экран.
 *
 * Требования:
 * •	Программа должна считывать числа с клавиатуры.
 * •	В классе должен быть метод public static void main.
 * •	В классе должен быть метод public static min, принимающий 5 параметров типа int.
 * •	Метод min должен возвращать минимум из 5 переданных чисел. Если минимальных чисел несколько -
 *      вернуть любое из них.
 * •	Программа должна выводить строку, которая начинается на "Minimum = ".
 * •	Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0528 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, Math.min(e,a)))));
        return min;
    }
}
