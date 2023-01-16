package lesson05;

/**
 * Кошкоинициация
 *
 * Создать класс Cat (кот) с пятью инициализаторами:
 * - Имя,
 * - Имя, вес, возраст
 * - Имя, возраст (вес стандартный)
 * - вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
 * - вес, цвет, адрес (чужой домашний кот)
 *
 * Задача инициализатора - сделать объект валидным.
 * Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
 * Кот не может ничего не весить.
 * То же касается возраста и цвета.
 * А вот имени может и не быть (null).
 * То же касается адреса: null.
 *
 * Требования:
 * •	У класса Cat должна быть переменная name с типом String.
 * •	У класса Cat должна быть переменная age с типом int.
 * •	У класса Cat должна быть переменная weight с типом int.
 * •	У класса Cat должна быть переменная address с типом String.
 * •	У класса Cat должна быть переменная color с типом String.
 * •	У класса должен быть метод initialize,
 *      принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
 * •	У класса должен быть метод initialize,
 *      принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
 * •	У класса должен быть метод initialize,
 *      принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
 * •	У класса должен быть метод initialize,
 *      принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
 * •	У класса должен быть метод initialize,
 *      принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
 *
 */

public class task0507 { // class Cat
    //напишите тут ваш код
    String name = null;
    int age = 4;
    int weight = 4;
    String address = null;
    String color = "Black";

    public void initialize (String name) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (int weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (int weight, String color, String address) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
