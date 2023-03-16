package lesson11;

/**
 * Скрытный инкапсулированный кот
 *
 * Скрой все внутренние переменные класса Cat.
 *
 * Требования:
 * •	Переменная name класса Cat должна быть скрыта.
 * •	Переменная age класса Cat должна быть скрыта.
 * •	Переменная weight класса Cat должна быть скрыта.
 * •	В классе Cat должны быть 3 переменные.
 * •	Все переменные класса Cat должны быть private.
 */

public class Task1106 {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat() {
        }

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}
