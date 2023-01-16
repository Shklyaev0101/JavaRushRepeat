package lesson04;

/**
 * Настя или Настя?
 * ****************
 * Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
 * Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
 * Если имена и длины имен разные - ничего не выводить.
 *
 * Требования:
 * •	Программа должна считывать две строки c клавиатуры.
 * •	Программа должна содержать System.out.println() или System.out.print()
 * •	Если имена одинаковые вывести сообщение "Имена идентичны"
 * •	Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
 * •	Если имена и длины имен разные - ничего не выводить.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0420 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();

        if (n1.equals(n2)) {
            System.out.println("Имена идентичны");
        }else if (n1.length() == n2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}

