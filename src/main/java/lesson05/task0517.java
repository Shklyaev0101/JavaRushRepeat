package lesson05;

import java.awt.*;

/**
 * Создать класс прямоугольник (Rectangle)
 *
 * Создать класс прямоугольник (Rectangle).
 * Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
 * Создать для него как можно больше методов конструкторов.
 *
 * Примеры:
 * - заданы 4 параметра: left, top, width, height
 * - ширина/высота не задана (оба равны 0)
 * - высота не задана (равно ширине) создаём квадрат
 * - создаём копию другого прямоугольника (он и передаётся в параметрах)
 *
 * Требования:
 * •	У класса Rectangle должны быть переменные top, left, width и height с типом int.
 * •	У класса должен быть хотя бы один конструктор.
 * •	У класса должно быть хотя бы два конструктора.
 * •	У класса должно быть хотя бы три конструктора.
 * •	У класса должно быть хотя бы четыре конструктора.
 */

public class task0517 {
    //напишите тут ваш код
    int top = 0;
    int left = 0;
    int width = 0;
    int height = 0;

    public task0517(int left, int top, int width, int height) {
        this.top = 2;
        this.left = 3;
        this.width = 6;
        this.height = 4;
    }

    public task0517(int left, int top) {
        this.top = 2;
        this.left = 3;
        this.width = width;
        this.height = height;
    }

    public task0517(int left, int top, int width) {
        this.top = 2;
        this.left = 3;
        this.width = 6;
        this.height = this.width;
    }

    public task0517(Rectangle rectangle2) {
        //this.top = rectangle2.top;
        //this.left = rectangle2.left;
        this.width = rectangle2.width;
        this.height = rectangle2.height;
    }


    public static void main(String[] args) {

    }

}
