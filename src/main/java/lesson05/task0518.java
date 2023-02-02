package lesson05;

/**
 * Максимум конструкторов
 *
 * Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.
 *
 * Подсказка:
 * не забудь про конструктор по умолчанию.
 *
 * Требования:
 * •	У класса должно быть хотя бы три переменные.
 * •	У класса должен быть конструктор по умолчанию.
 * •	У класса должен быть хотя бы один конструктор.
 * •	У класса должно быть хотя бы два конструктора.
 * •	У класса должно быть хотя бы три конструктора.
 * •	У класса должно быть хотя бы четыре конструктора.
 */


public class task0518 {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public task0518() {
    }

    public task0518(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public task0518(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 6;
    }

    public task0518(double x) {
        this.x = x;
        this.y = 2;
        this.radius = 4;
    }

    public static void main(String[] args) {

    }
}
