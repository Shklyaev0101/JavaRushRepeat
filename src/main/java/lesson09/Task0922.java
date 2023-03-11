package lesson09;

/**
 * Десять котов
 *
 * Есть класс кот - Cat, с полем "имя" (String).
 * Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
 * Получить из Map множество(Set) всех котов и вывести его на экран.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Метод createMap должен создавать новый объект HashMap<String, Cat>.
 * •	Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
 * •	Метод createMap должен возвращать созданный словарь.
 * •	Метод convertMapToSet должен создать и вернуть множество котов,
 *      полученных из переданного словаря.
 * •	Программа должна вывести всех котов из множества на экран.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class Task0922 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> nameAndCat = new HashMap<>();
        nameAndCat.put ("q", new Cat("1"));
        nameAndCat.put ("w", new Cat("2"));
        nameAndCat.put ("e", new Cat("3"));
        nameAndCat.put ("r", new Cat("4"));
        nameAndCat.put ("t", new Cat("5"));
        nameAndCat.put ("y", new Cat("6"));
        nameAndCat.put ("u", new Cat("7"));
        nameAndCat.put ("i", new Cat("8"));
        nameAndCat.put ("o", new Cat("9"));
        nameAndCat.put ("p", new Cat("10"));
        return nameAndCat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {

            this.name = name;
        }

        public String toString() {

            return "Cat " + this.name;
        }
    }


}
