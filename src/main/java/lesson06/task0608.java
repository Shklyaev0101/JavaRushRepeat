package lesson06;

/**
 * Класс ConsoleReader
 *
 * Сделать класс ConsoleReader, у которого будут 4 статических метода:
 * String readString() - читает с клавиатуры строку
 * int readInt() - читает с клавиатуры число
 * double readDouble() - читает с клавиатуры дробное число
 * boolean readBoolean() - читает с клавиатуры строку "true" или "false"
 * и возвращает соответствующую логическую переменную true или false
 *
 * Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
 *
 * Требования:
 * •	Метод readString должен считывать и возвращать строку(тип String).
 * •	Метод readInt должен считывать и возвращать число(тип int).
 * •	Метод readDouble должен считывать и возвращать дробное число(тип double).
 * •	Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0608 {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int nA = Integer.parseInt(sA);
        return nA;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sB = reader.readLine();
        double nB = Double.parseDouble(sB);
        return nB;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Boolean bC = Boolean.parseBoolean (reader.readLine());
        return bC;
    }

    public static void main(String[] args) throws Exception {

    }
}
