package lesson09;

import java.io.FileNotFoundException;
import java.net.SocketException;

/**
 * Все свои, даже исключения
 *
 * Есть четыре класса MyException, MyException2, MyException3, MyException4.
 * Унаследуй классы так, чтобы у тебя появились любые два checked исключения
 * и любые два unchecked исключения.
 *
 * Подсказка:
 * Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
 *
 * Требования:
 * •	В классе Solution должно быть 4 вложенных класса: MyException, MyException2,
 *      MyException3 и MyException4.
 * •	Все вложенные классы должны быть унаследованы от классов исключений.
 * •	Два класса из четырех должны быть checked исключениями.
 * •	Два класса из четырех должны быть unchecked исключениями.
 */

public class Task0917 {
    public static void main(String[] args) {
    }

    static class MyException extends Exception {
    }

    static class MyException2 extends Exception {
    }

    static class MyException3 extends ArithmeticException {
    }

    static class MyException4 extends IndexOutOfBoundsException{
    }
}
