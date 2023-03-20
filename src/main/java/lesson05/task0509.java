package lesson05;

/**
 * Создать класс Circle
 *
 * Создать класс (Circle) круг, с тремя инициализаторами:
 * - centerX, centerY, radius
 * - centerX, centerY, radius, width
 * - centerX, centerY, radius, width, color
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
 * •	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY,
 *      radius и инициализирующий соответствующие переменные класса.
 * •	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY,
 *      radius, width и инициализирующий соответствующие переменные класса.
 * •	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY,
 *      radius, width, color и инициализирующий соответствующие переменные класса.
 */

public class task0509 {
    //напишите тут ваш код
    public int centerX = 0;
    public int centerY = 0;
    public int radius = 0;
    public void initialize (int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public int width = 0;
    public void initialize (int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public int color = 0;
    public void initialize (int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }



    public static void main(String[] args) {

    }
}
