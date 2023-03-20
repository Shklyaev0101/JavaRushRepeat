package lesson12;

/**
 * То ли птица, то ли лампа
 *
 * Напиши метод, который определяет, объект какого класса ему передали,
 * и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 *
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Класс Cat менять нельзя.
 * •	Класс Dog менять нельзя.
 * •	Класс Bird менять нельзя.
 * •	Класс Lamp менять нельзя.
 * •	Метод printObjectType() должен выводить на экран одну из надписей,
 *      в зависимости от переданного объекта. Например "Лампа" для объектов типа Solution.Lamp.
 */

public class Task1204 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        if(o.getClass() .equals(Cat.class)) {
            System.out.println("Кошка");
        }
        else if (o.getClass().equals(Bird.class)) {
            System.out.println("Птица");
        }
        else if (o.getClass().equals(Lamp.class)) {
            System.out.println("Лампа");
        }
        else if (o.getClass().equals(Dog.class)) {
            System.out.println("Собака");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}