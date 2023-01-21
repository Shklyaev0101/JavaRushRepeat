package lesson04;

/**
Ближайшее к 10
Напиши метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел,
записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10,
то вывести на экран любое из них.

Подсказка:
используй метод public static int abs(int a), который возвращает абсолютную величину числа.

Требования:
•	Программа должна выводить числа на экран.
•	Метод main не должен вызывать System.out.println() или System.out.print().
•	Метод main должен вызывать метод displayClosestToTen.
•	Метод displayClosestToTen должен вызывать метод abs.
•	Метод displayClosestToTen должен выводить число на экран согласно заданию.
 */

public class task0408 {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        if (abs (a -10) <= abs (b -10)) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
