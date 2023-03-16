package lesson08;

/**
 * LinkedList и ArrayList
 *
 * Нужно создать два списка - LinkedList и ArrayList.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Программа не должна считывать значения с клавиатуры.
 * •	Программа должна содержать только три метода.
 * •	Метод createArrayList() должен создавать и возвращать список ArrayList.
 * •	Метод createLinkedList() должен создавать и возвращать список LinkedList.
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class task0807 {
    public static Object createArrayList() {
        //напишите тут ваш код
        ArrayList<String> aList = new ArrayList<>();
        for (int i = 0; i < aList.size(); i++) {
        }
        return aList;
    }

    public static Object createLinkedList() {
        //напишите тут ваш код
        LinkedList<String> lList = new LinkedList<>();
        for (int i = 0; i < lList.size(); i++) {
        }
        return lList;
    }

    public static void main(String[] args) {

    }
}
