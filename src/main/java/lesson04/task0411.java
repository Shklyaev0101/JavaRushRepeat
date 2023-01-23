package lesson04;

/**
 * Положительное и отрицательное число
 * Ввести с клавиатуры число.
 * Если число положительное, то увеличить его в два раза.
 * Если число отрицательное, то прибавить единицу.
 * Если введенное число равно нулю, необходимо вывести ноль.
 * Вывести результат на экран.
 *
 * Требования:
 * •	Программа должна считывать число c клавиатуры.
 * •	Программа должна выводить число на экран.
 * •	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
 * •	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
 * •	Если введенное число равно нулю, необходимо вывести ноль.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0411 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int Xnumber = Integer.parseInt(number);

        if (Xnumber > 0) {
            Xnumber = Xnumber * 2;
            System.out.println(Xnumber);
        } else if (Xnumber < 0) {
            Xnumber = Xnumber + 1;
            System.out.println(Xnumber);
        } else if (Xnumber == 0) {
            Xnumber = 0;
            System.out.println(Xnumber);
        }
    }
}
