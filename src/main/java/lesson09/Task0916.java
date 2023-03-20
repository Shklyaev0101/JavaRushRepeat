package lesson09;

/**
 * Перехват unchecked-исключений
 *
 * В методе handleExceptions обработайте все unchecked исключения.
 * Нужно вывести стек-трейс возникшего исключения используя метод printStack.
 * Можно использовать только один блок try..catch
 *
 * Требования:
 * •	Метод handleExceptions должен вызывать метод method1.
 * •	Метод handleExceptions должен вызывать метод method2.
 * •	Метод handleExceptions должен вызывать метод method3.
 * •	Метод handleExceptions должен использовать только один блок try..catch.
 * •	Метод handleExceptions должен отлавливать все unchecked исключения и выводить стек-трейс возникшего исключения, используя метод printStack.
 * •	Метод handleExceptions не должен отлавливать checked исключения
 * •	Программа должна выводить на экран текст.
 */

public class Task0916 {
    public static void main(String[] args) {
        handleExceptions(new Task0916());
    }

    public static void handleExceptions(Task0916 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
