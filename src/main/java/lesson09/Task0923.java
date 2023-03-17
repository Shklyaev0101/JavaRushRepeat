package lesson09;

/**
 * Список из массивов чисел
 *
 * Создать список, элементами которого будут массивы чисел.
 * Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
 * Заполнить массивы любыми данными и вывести их на экран.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Метод createList должен объявлять и инициализировать переменную типа ArrayList<int[]>.
 * •	Метод createList должен возвращать созданный список.
 * •	Метод createList должен добавлять в список 5 элементов.
 * •	Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2,
 *      следующих - 4, 7, 0 соответственно.
 * •	Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task0923 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
            list.add(new int[5]);
            list.add(new int[2]);
            list.add(new int[4]);
            list.add(new int[7]);
            list.add(new int[0]);
            return list;

        //return new ArrayList<>(Arrays.asList (new int[]{1,2,3,4,5}, new int[]{1,2}, new int[]{1,2,3,4}, new int[]{1,2,3,4,5,6,7}, new int[]{0}));
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

