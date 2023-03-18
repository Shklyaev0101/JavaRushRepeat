package lesson06;

/**
 * Класс StringHelper
 *
 * Сделать класс StringHelper, у которого будут 2 статических метода:
 * String multiply(String s, int count) - возвращает строку повторенную count раз.
 * String multiply(String s) - возвращает строку повторенную 5 раз.
 *
 * Пример:
 * Амиго -> АмигоАмигоАмигоАмигоАмиго
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Методы класса StringHelper должны возвращать строку.
 * •	Методы класса StringHelper должны быть статическими.
 * •	Методы класса StringHelper должны быть public.
 * •	Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
 * •	Метод multiply(String s) должен возвращать строку повторенную 5 раз.
 */

public class task0609 {
    public static String multiply(String text) {
        String result = "";
        //напишите тут ваш код
        return text + text+ text+ text+ text;
        }

    public static String multiply(String text, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return  result;
    }

    public static void main(String[] args) {

    }
}
