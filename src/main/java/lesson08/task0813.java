package lesson08;

/**
 * Больше 10? Вы нам не подходите
 *
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Программа не должна считывать значения с клавиатуры.
 * •	Класс Solution должен содержать только три метода.
 * •	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
 * •	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
 */

import java.util.HashSet;
import java.util.Set;

public class task0813 {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer> copySet = new HashSet<>();
        copySet.addAll(set);

        for (Integer num : copySet) {
            if(num > 10) {
                set.remove(num);
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}