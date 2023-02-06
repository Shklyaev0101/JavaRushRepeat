package lesson07;

import java.io.IOException;

/**
 * -=Минимаксы в массивах=-
 *
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 *
 * Требования:
 * •	В классе Solution создай статический публичный метод int[] getInts().
 * •	Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
 * •	В методе main создай и проинициализируй массив с помощью метода getInts(),
 *      найди и выведи через пробел максимальный и минимальный элемент массива.
 * •	Используй цикл for.
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task0716 {
    public static void main(String[] args) throws IOException {

        //напишите тут ваш код
        int[] list = getInts();

        int minimum = list[0];
        int maximum = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < minimum) {
                minimum = list[i];
            }
            if (list[i] > maximum) {
                maximum = list[i];
            }
        }
            System.out.println(maximum + " " + minimum);
    }

        //напишите тут ваш код
        public static int[] getInts() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int[] list = new int[20];
            for (int i = 0; i < list.length; i++) {
                list[i] = Integer.parseInt(reader.readLine());

            }
            return list;
        }
}
