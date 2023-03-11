package Lesson10;

/**
 * Задача №2 на преобразование целых типов
 *
 * Правильно расставь операторы приведения типа, чтобы получился ответ: d=3.765.
 * int a = 15;
 * int b = 4;
 * float c = a / b;
 * double d = a * 1e-3 + c;
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Нельзя менять команду вывода на экран.
 * •	Метод main() должен содержать переменную a типа int.
 * •	Метод main() должен содержать переменную b типа int.
 * •	Метод main() должен содержать переменную c типа float.
 * •	Метод main() должен содержать переменную d типа double.
 * •	Начальное значение переменных при инициализации менять нельзя.
 *      Можно добавлять только операторы приведения типа.
 * •	Программа должна выводить число 3.765.
 */

public class Task1002 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
        //System.out.println(c);
    }
}
