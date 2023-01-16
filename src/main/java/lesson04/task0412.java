package lesson04;

/**
 * День недели
 * Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
 * "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
 * если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
 *
 * Пример для номера 5:
 * пятница
 *
 * Пример для номера 10:
 * такого дня недели не существует
 *
 * Требования:
 * •	Программа должна считывать число c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Если введено число от 1 до 7, необходимо вывести день недели.
 * •	Если введено число не входящее в интервал от 1 до 7,
 *      то вывести уведомление что такого дня недели не существует.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0412 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sDay = reader.readLine();
        int day = Integer.parseInt(sDay);

        if (day == 1) {
            System.out.println("понедельник");
        }
        else if (day == 2) {
            System.out.println("вторник");
        }
        else if (day == 3) {
            System.out.println("среда");
        }
        else if (day == 4) {
            System.out.println("четверг");
        }
        else if (day == 5) {
            System.out.println("пятница");
        }
        else if (day == 6) {
            System.out.println("суббота");
        }
        else if (day == 7) {
            System.out.println("воскресенье");
        }
        else if (day > 7 || day < 1) {
            System.out.println("такого дня недели не существует");
        }
    }
}
