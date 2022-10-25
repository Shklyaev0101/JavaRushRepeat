package lesson02;

/*
Реализуем метод print
Допиши код в методе print, чтобы он выводил на экран каждую переданную в него строку 4 раза. Каждый раз с новой строки.

На экран должно быть выведено:
Java is easy to learn!
Java is easy to learn!
Java is easy to learn!
Java is easy to learn!
Java is object-oriented!
Java is object-oriented!
Java is object-oriented!
Java is object-oriented!
Java is platform-independent!
Java is platform-independent!
Java is platform-independent!
Java is platform-independent!

Requirements:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println или System.out.print.
3. Метод print должен выводить текст на экран.
4. Метод main должен вызвать метод print класса Solution ровно три раза.
5. Метод print должен выводить на экран переданную строку 4 раза. Каждый раз с новой строки.
 */

public class task0201 {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String text) {
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
        }

    }
