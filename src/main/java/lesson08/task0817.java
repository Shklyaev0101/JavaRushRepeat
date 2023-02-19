package lesson08;

/**
 * -=Пять победителей=-
 *
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Вывести пять наибольших чисел.
 * Каждое значение с новой строки.
 *
 * Требования:
 * •	Программа должна выводить числа на экран.
 * •	Программа должна считывать значения с клавиатуры.
 * •	Класс Solution должен содержать два метода.
 * •	Метод sort() должен сортировать массив чисел от большего к меньшему.
 * •	Метод main() должен вызывать метод sort().
 * •	Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Arrays;

public class task0817 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
}
