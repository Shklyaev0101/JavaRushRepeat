package lesson04;

/**
 * Суммирование
 * Вводить с клавиатуры числа.
 * Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 * -1 должно учитываться в сумме.
 *
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 *
 * while (true) {
 *     int number = считываем число;
 *     if (проверяем, что number -1)
 *         break;
 * }
 * Требования:
 * •	Программа должна считывать числа c клавиатуры.
 * •	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
 * •	Программа должна посчитать сумму введенных чисел и вывести её на экран.
 * •	В программе должен использоваться цикл for, while или do-while.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0441 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


    }
}
