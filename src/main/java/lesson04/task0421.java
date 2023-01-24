package lesson04;

/**
 * 18+
 * Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".
 *
 * Требования:
 * •	Программа должна дважды считать данные c клавиатуры.
 * •	Программа должна использовать команду System.out.println() или System.out.print().
 * •	Если возраст меньше 18 вывести только сообщение "Подрасти еще".
 * •	Если возраст больше либо равно 18 ничего не выводить.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0421 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);

        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
