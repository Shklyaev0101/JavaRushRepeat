package lesson05;

/**
 * Кошачья бойня
 *
 * Создать три кота используя класс Cat.
 * Провести три боя попарно между котами.
 * Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
 * Результат каждого боя вывести на экран c новой строки.
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Нужно создать три объекта типа Cat.
 * •	Нужно провести три боя.
 * •	Программа должна вывести результат каждого боя с новой строки.
 *
 */

public class task0502 {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Oleg",3,5,6);
        Cat cat2 = new Cat("Vasia",4,6,7);
        Cat cat3 = new Cat("Nikita",5,7,8);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));

    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
