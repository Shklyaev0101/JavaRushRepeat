package lesson09;

/**
 * Деление на нуль
 *
 * Создай метод public static void divideByZero,
 * в котором подели любое число на ноль и выведи на экран результат деления.
 * Оберни вызов метода divideByZero в try..catch.
 * Выведи стек-трейс исключения используя метод exception.printStackTrace()
 *
 * Требования:
 * •	В классе должен быть метод public static void divideByZero().
 * •	Метод divideByZero должен содержать операцию деления любого целого числа на ноль.
 * •	Метод divideByZero должен вызывать System.out.println или System.out.print.
 * •	Метод main должен содержать блок try..catch.
 * •	Метод main должен отлавливать любые исключения метода divideByZero.
 * •	Программа должна выводить стек-трейс пойманого исключения.
 *
 */

public class Task0918 {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public static void divideByZero() {
        int x = 10;
        //int y = 0;
        System.out.println(x / 0);
    }
}
