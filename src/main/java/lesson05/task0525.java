package lesson05;

/**
 * Вывести на экран сегодняшнюю дату
 *
 * Вывести на экран текущую дату в аналогичном виде "21 02 2014".
 *
 * Требования:
 * •	Дата должна содержать день, месяц и год, разделенные пробелом.
 * •	День должен соответствовать текущему.
 * •	Месяц должен соответствовать текущему.
 * •	Год должен соответствовать текущему.
 * •	Вся дата должна быть выведена в одной строке.
 *
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class task0525 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Calendar calendar = new GregorianCalendar(2014, 1, 21);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
