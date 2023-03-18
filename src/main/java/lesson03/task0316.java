package lesson03;

/*
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.


Requirements:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное имя.
4. Выведенный текст должен содержать введенное число1.
5. Выведенный текст должен содержать введенное число2.
6. Выведенный текст должен полностью соответствовать заданию.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0316 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sNumeric1 = reader.readLine();
        String sNumeric2 = reader.readLine();
        int Numeric1 = Integer.parseInt(sNumeric1);
        int Numeric2 = Integer.parseInt(sNumeric2);

        System.out.println(name + " " + "получает" + " " + Numeric1 + " " + "через" + " " + Numeric2 + " " + "лет.");
    }
}
