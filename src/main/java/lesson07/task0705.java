package lesson07;

/**
 * Один большой массив и два маленьких
 *
 * 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких:
 *    половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран,
 *    каждое значение выводить с новой строки.
 *
 * Требования:
 * •	Программа должна создавать большой массив на 20 целых чисел.
 * •	Программа должна считывать с клавиатуры 20 чисел для большого массива.
 * •	Программа должна создавать два маленьких массива на 10 чисел каждый.
 * •	Программа должна скопировать одну половину большого массива
 *      в первый маленький, а вторую - во второй и вывести второй маленький массив
 *      на экран.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class task0705 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        //int[]listCopy1 = new int[10];
        int[] listCopy1 = Arrays.copyOf(list,list.length/2);
        //int[]listCopy2 = new int[10];
        int [] listCopy2 = Arrays.copyOfRange(list,list.length/2,list.length);
        System.out.println(Arrays.toString(listCopy2));
    }
}
