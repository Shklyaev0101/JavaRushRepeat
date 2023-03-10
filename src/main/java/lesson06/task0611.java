package lesson06;

/**
 * Калькулятор
 *
 * Сделать класс Calculator, у которого будут 5 статических методов:
 * int plus(int a, int b) - возвращает сумму чисел a и b
 * int minus(int a, int b) - возвращает результат вычитания из числа a числа b
 * int multiply(int a, int b) - возвращает результат умножения числа a на число b
 * double division(int a, int b) - возвращает результат деления числа a на число b
 * double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)
 *
 * Требования:
 * •	Метод plus должен возвращать сумму чисел a и b.
 * •	Метод minus должен возвращать результат вычитания из числа a числа b
 * •	Метод multiply должен возвращать результат умножения числа a на число b.
 * •	Метод division должен возвращать результат деления числа a на число b.
 * •	Метод percent должен возвращать b процентов от числа a.
 */

public class task0611 {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int plusResult = a + b;
        return plusResult;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int minusResult = a - b;
        return minusResult;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int multiplyResult = a * b;
        return multiplyResult;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        int divisionResult = a / b;
        return divisionResult;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double percentResult = ((double) a * b / 100);
        return percentResult;
    }

    public static void main(String[] args) {

    }
}
