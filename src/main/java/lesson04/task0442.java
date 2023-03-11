package lesson04;

/**
 * Как назвали, так назвали
 * Ввести с клавиатуры строку name.
 * Ввести с клавиатуры дату рождения (три числа): y, m, d.
 *
 * Вывести на экран текст:
 * "Меня зовут name.
 * Я родился d.m.y"
 *
 * Пример вывода:
 * Меня зовут Вася.
 * Я родился 15.2.1988
 *
 * Требования:
 * •	Программа должна считывать строки c клавиатуры.
 * •	Программа должна выводить строки на экран.
 * •	Программа должна выводить текст, шаблон которого указан в задании.
 * •	Каждое предложение вывести с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0442 {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int y = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "."+ m + "." + y);
    }
}
