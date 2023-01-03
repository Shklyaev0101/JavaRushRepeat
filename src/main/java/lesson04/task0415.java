package lesson04;

/**
 * Переходим дорогу в слепую
 * Работа светофора для пешеходов запрограммирована следующим образом:
 * в начале каждого часа в течение трех минут горит зелёный сигнал,
 * затем в течение одной минуты - жёлтый,
 * а потом в течение одной минуты - красный,
 * затем опять зелёный горит три минуты и т. д.
 * Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
 * Определить, сигнал какого цвета горит для пешеходов в этот момент.
 * Результат вывести на экран в следующем виде:
 * "зелёный" - если горит зелёный цвет,
 * "жёлтый" - если горит жёлтый цвет,
 * "красный" - если горит красный цвет.
 * <p>
 * Пример для числа 2.5:
 * зелёный
 * <p>
 * Пример для числа 3:
 * жёлтый
 * <p>
 * Пример для числа 4:
 * красный
 * <p>
 * Пример для числа 5:
 * зелёный
 * <p>
 * Требования:
 * •	Программа должна считывать вещественное число c клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Если горит зелёный цвет, необходимо вывести текст: "зелёный"
 * •	Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
 * •	Если горит красный цвет, необходимо вывести текст: "красный"
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0415 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sT = reader.readLine();
        double t = Double.parseDouble(sT);

        if (t % 5 < 3) {
            System.out.println("зелёный");
        }
        else if (t % 5 < 4) {
            System.out.println("жёлтый");
        }
        else if (t % 5 < 5) {
            System.out.println("красный");
        }

       /* if (t >= 0 & t < 3.0 | t >= 5.0 & t < 8.0 |
                t >= 10.0 & t < 13.0 | t >= 15.0 & t < 18.0 |
                t >= 20.0 & t < 23.0 | t >= 25.0 & t < 28.0 |
                t >= 30.0 & t < 33.0 | t >= 35.0 & t < 38.0 |
                t >= 40.0 & t < 43.0 | t >= 45.0 & t < 48.0 |
                t >= 50.0 & t < 53.0 | t >= 55.0 & t < 58.0) {
            System.out.println("зеленый");
        } else if (t >= 3.0 & t < 4.0 | t >= 8.0 & t < 9.0 |
                t >= 13.0 & t < 14.0 | t >= 18.0 & t < 19.0 |
                t >= 23.0 & t < 24.0 | t >= 28.0 & t < 29.0 |
                t >= 33.0 & t < 34.0 | t >= 38.0 & t < 39.0 |
                t >= 43.0 & t < 44.0 | t >= 48.0 & t < 49.0 |
                t >= 53.0 & t < 54.0 | t >= 58.0 & t < 59.0 ) {
            System.out.println("желтый");
        } else if (t >= 4.0 & t< 5.0 | t >= 9.0 & t < 10.0 |
                t >= 14.0 & t < 15.0 | t >= 19.0 & t < 20.0 |
                t >= 24.0 & t < 25.0 | t >= 29.0 & t < 30.0 |
                t >= 34.0 & t < 35.0 | t >= 39.0 & t < 40.0 |
                t >= 44.0 & t < 45.0 | t >= 49.0 & t < 50.0 |
                t >= 54.0 & t < 55.0 | t >= 59.0 & t < 60.0 ) {
            System.out.println("красный");
        }
        */
    }
}
