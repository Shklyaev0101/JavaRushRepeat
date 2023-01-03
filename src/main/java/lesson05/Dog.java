package lesson05;

/**
 * Геттеры и сеттеры для класса Dog_(1)
 *
 * Создать class Dog. У собаки должна быть кличка String name и возраст int age.
 * Создай геттеры и сеттеры для всех переменных класса Dog.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	У класса Dog должна быть переменная name с типом String.
 * •	У класса Dog должна быть переменная age с типом int.
 * •	У класса должен быть сеттер для переменной name.
 * •	У класса должен быть геттер для переменной name.
 * •	У класса должен быть сеттер для переменной age.
 * •	У класса должен быть геттер для переменной age.
 */

public class Dog {
    //_(1) Напишите тут ваш код
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
