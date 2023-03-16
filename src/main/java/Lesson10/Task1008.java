package Lesson10;

/**
 * Правильный ответ: d = 1.0
 *
 * Добавь в метод main() одну операцию по преобразованию типа, чтобы получался ответ: d = 1.0.
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Нельзя менять команду вывода на экран.
 * •	Метод main() должен содержать переменную a типа int.
 * •	Метод main() должен содержать переменную b типа int.
 * •	Метод main() должен содержать переменную c типа int.
 * •	Метод main() должен содержать переменную e типа int.
 * •	Метод main() должен содержать переменную d типа double.
 * •	Значения переменных менять нельзя. Можно добавлять только операторы приведения типа.
 * •	Программа должна выводить число 1.0.
 */

public class Task1008 {
    public static void main(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b / c / e;

        System.out.println(d);
    }
}