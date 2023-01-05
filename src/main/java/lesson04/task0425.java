package lesson04;

/**
 * Ярлыки и числа
 * Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
 * "отрицательное четное число" - если число отрицательное и четное,
 * "отрицательное нечетное число" - если число отрицательное и нечетное,
 * "ноль" - если число равно 0,
 * "положительное четное число" - если число положительное и четное,
 * "положительное нечетное число" - если число положительное и нечетное.
 *
 * Пример для числа 100:
 * положительное четное число
 *
 * Пример для числа -51:
 * отрицательное нечетное число
 *
 * Требования:
 * •	Программа должна считывать число c клавиатуры.
 * •	Программа должна использовать команду System.out.println() или System.out.print().
 * •	Если число отрицательное и четное, вывести "отрицательное четное число".
 * •	Если число отрицательное и нечетное, вывести "отрицательное нечетное число".
 * •	Если число равно 0, вывести "ноль".
 * •	Если число положительное и четное, вывести "положительное четное число".
 * •	Если число положительное и нечетное, вывести "положительное нечетное число".
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0425 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if ((number < 0) && ((number % 2)== 0)) {
            System.out.println("отрицательное четное число");
        } else if ((number < 0) && !((number % 2)== 0)) {
            System.out.println("отрицательное нечетное число");
        } else if (number == 0) {
            System.out.println("ноль");
        } else if ((number > 0) && ((number % 2)== 0)) {
            System.out.println("положительное четное число");
        } else if ((number > 0) && !((number % 2)== 0)) {
            System.out.println("положительное нечетное число");
        }
    }
}