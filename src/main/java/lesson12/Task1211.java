package lesson12;

/**
 * Абстрактный класс Pet
 *
 * Сделай класс Pet абстрактным.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Класс Pet должен быть статическим.
 * •	Класс Pet должен быть абстрактным.
 * •	Класс Pet должен иметь один метод getName().
 */

public class Task1211 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }
    }

}

