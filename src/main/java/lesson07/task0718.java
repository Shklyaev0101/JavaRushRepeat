package lesson07;

import java.util.ArrayList;

/**
 * Семейная перепись
 *
 * Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 * Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
 * Вывести объекты на экран.
 *
 * Примечание:
 * Если написать свой метод String toString() в классе Human,
 * то именно он будет использоваться при выводе объекта на экран.
 *
 * Пример вывода:
 * Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 * Имя: Катя, пол: женский, возраст: 55
 * Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 * ...
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 * •	Добавить в класс конструктор public Human(String name, boolean sex, int age).
 * •	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
 * •	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
 * •	Выведи созданные объекты на экран.
 */

public class task0718 {
    public static ArrayList<Human> list = new ArrayList<>();
    public static void main(String[] args) {
        // напишите тут ваш код
        Human Ann = new Human("Ann", false, 19);
        Human Anna = new Human("Anna", false, 20);
        Human gMa = new Human("Olga", false, 21);
        Human gPa = new Human("Masha", true, 22);

        Human Stas = new Human("Stas", true, 55, gPa, gMa );
        Human Dima = new Human("Dima", true, 56, gPa, gMa );
        Human Slava = new Human("Slava", true, 45, gPa, gMa );
        Human Kostya = new Human("Kostya", true, 35, gPa, gMa );
        Human Ulan = new Human("Ulan", true, 65, gPa, gMa );

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            list.add(Human.this);
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            list.add (Human.this);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}