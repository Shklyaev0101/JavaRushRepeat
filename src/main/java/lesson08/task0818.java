package lesson08;

/**
 * Номер месяца
 *
 * Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде:
 * "May is the 5 month".
 * Используй коллекции.
 *
 * Требования:
 * •	Программа должна считывать одно значение с клавиатуры.
 * •	Программа должна выводить текст на экран.
 * •	Программа должна использовать коллекции.
 * •	Программа должна считывать с клавиатуры имя месяца и
 *      выводить его номер на экран по заданному шаблону.
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class task0818 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> monthList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            monthList.add(reader.readLine());
        }

    }
}
