package lesson05;

/**
 * Конструируем котиков
 *
 * Создать класс Cat (кот) с пятью конструкторами:
 * - Имя,
 * - Имя, вес, возраст
 * - Имя, возраст (вес стандартный)
 * - вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
 * - вес, цвет, адрес (чужой домашний кот)
 *
 * Задача конструктора - сделать объект валидным.
 * Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 * Кот не может ничего не весить.
 * То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 *
 * Требования:
 * •	У класса Cat должна быть переменная name с типом String.
 * •	У класса Cat должна быть переменная age с типом int.
 * •	У класса Cat должна быть переменная weight с типом int.
 * •	У класса Cat должна быть переменная address с типом String.
 * •	У класса Cat должна быть переменная color с типом String.
 * •	У класса должен быть конструктор,
 *      принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
 * •	У класса должен быть конструктор,
 *      принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
 * •	У класса должен быть конструктор,
 *      принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
 * •	У класса должен быть конструктор,
 *      принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
 * •	У класса должен быть конструктор,
 *      принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
 *
 */

public class task0514 {
    //напишите тут ваш код
    public String name = null;
    public int age = 5;
    public int weight = 5;
    public String address = null;
    String color = "Black";

    public task0514(String name) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public task0514(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public task0514(String name, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public task0514(int weight, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public task0514(int weight, String color, String address) {
        this.weight = weight;
        this.age = age;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}