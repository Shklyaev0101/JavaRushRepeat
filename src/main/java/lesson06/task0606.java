package lesson06;

/**
 * Статические методы для кошек
 *
 * Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
 * с помощью которых можно получить/изменить количество котов (переменную catCount).
 *
 * Требования:
 * •	Добавь в класс метод getCatCount.
 * •	Метод getCatCount должен возвращать int.
 * •	Метод getCatCount должен возвращать значение переменной catCount.
 * •	Добавь в класс метод setCatCount, принимающий int.
 * •	Метод setCatCount ничего не должен возвращать.
 * •	Метод setCatCount должен присваивать переменной catCount переданное значение.
 */


public class task0606 { //Cat
    private static int catCount = 0;
    Cat cat = new Cat();
/*
    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        //напишите тут ваш код
        return Cat.catCount();
    }

    private static int catCount() {
    }

    public static void setCatCount(int catCount) {
        //напишите тут ваш код
        this.catCount = catCount;

    }
*/
    public static void main(String[] args) {

    }
}
