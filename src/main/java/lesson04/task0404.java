package lesson04;

/**
Задаем количество котов
Напиши метод setCatsCount. Метод должен устанавливать количество котов (catsCount).

Requirements:
1. Класс Cat должен содержать только одну переменную catsCount.
2. Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
3. Класс Cat должен содержать два метода setCatsCount и main.
4. Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount равным переданному параметру.
 */

public class task0404 {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        task0404.catsCount = catsCount;

    }

    public static void main(String[] args) {

    }
}