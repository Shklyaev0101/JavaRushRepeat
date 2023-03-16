package lesson04;

/**
Учет котов
Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.

Requirements:
1. Класс Cat должен содержать только одну переменную catsCount.
2. Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и
проинициализирована нулем.
3. Класс Cat(task) должен содержать два static метода addNewCat и main.
4. Метод addNewCat класса Cat должен увеличивать количество котов на 1.
 */

public class task0403 {
    private static int catsCount = 0;

    public static int addNewCat() {
        catsCount++;
        return catsCount;
    }

    public static void main(String[] args) {
    }
}
