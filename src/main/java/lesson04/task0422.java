package lesson04;

/**
 * Фейс- контроль
 * Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".
 *
 * Требования:
 * •	Программа должна считывать строки c клавиатуры.
 * •	Программа должна использовать команду System.out.println() или System.out.print().
 * •	Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
 * •	Если возраст меньше либо равно 20 ничего не выводить.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0422 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);

        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}

