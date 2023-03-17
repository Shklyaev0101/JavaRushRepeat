package lesson11;

/**
 * Наш код слишком публичен
 *
 * Скрой внутренние переменные класса Cat, к которым есть доступ с помощью методов.
 *
 * Требования:
 * •	Переменная name класса Cat должна быть скрыта.
 * •	Переменная age класса Cat должна быть скрыта.
 * •	Переменная weight класса Cat должна быть открыта.
 * •	В классе Cat должны быть 3 переменные.
 * •	В Cat должны быть private и public переменные.
 */

public class Task1107 {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
