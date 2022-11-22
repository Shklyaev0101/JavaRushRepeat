package lesson03;

/*
Финансовые ожидания
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час

Requirements:
1. Программа должна выводить текст.
2. Программа должна считывать данные с клавиатуры.
3. Выведенный текст должен содержать введенное число n.
4. Выведенный тест должен полностью соответствовать заданию.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task0322 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);

        System.out.println("Я буду зарабатывать $" + n + " в час");
    }
}
