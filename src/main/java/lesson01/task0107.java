package lesson01;

/*
Вносим изменения в код:
        public static void main(String[] args) {
        String name = "Ellie";
        String text = "Hello, " + name + "!";
        System.out.println(text);

Внеси изменения в программу, чтобы переменная name имела значение Amigo.

Requirements:
1. Переменной name должно присваиваться значение сразу после создания.
2. Должно быть объявлено 2 переменных.
3. Значение переменной text изменять нельзя.
4. Команду вывода текста на экран изменять нельзя.
5. Программа должна выводить текст "Hello, Amigo!".
 */

public class task0107 {
    public static void main(String[] args) {
        String name = "Amigo";
        String text = "Hello, " + name + "!";
        System.out.println(text);
    }
}
