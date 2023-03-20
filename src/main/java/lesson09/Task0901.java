package lesson09;

/**
 * Возвращаем StackTrace
 *
 * Написать пять методов, которые вызывают друг друга.
 * Каждый метод должен возвращать свой StackTrace.
 *
 * Требования:
 * •	В классе должно быть 5 методов (метод main не учитывать).
 * •	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
 * •	Каждый метод должен возвращать свой StackTrace.
 * •	Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().
 *
 */

public class Task0901 {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element: stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element: stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element: stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element: stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element: stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }
}
