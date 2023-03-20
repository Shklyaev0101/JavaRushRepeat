package lesson05;

/**
 * Мужчина и женщина
 *
 * 1. Внутри класса Solution создай public static классы Man и Woman.
 * 2. У классов должны быть поля: name (String), age (int), address (String).
 * 3. Создай конструкторы, в которые передаются все возможные параметры.
 * 4. Создай по два объекта каждого класса со всеми данными используя конструктор.
 * 5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 *
 * Требования:
 * •	В классе Solution создай public static класс Man.
 * •	В классе Solution создай public static класс Woman.
 * •	Класс Man должен содержать переменные: name(String), age(int) и address(String).
 * •	Класс Woman должен содержать переменные: name(String), age(int) и address(String).
 * •	У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
 * •	Конструкторы должны инициализировать переменные класса.
 * •	В методе main необходимо создать по два объекта каждого типа.
 * •	Метод main должен выводить созданные объекты на экран в указанном формате.
 *
 */

public class task0523 { //Solution
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man(null,1,null);
        Man man2 = new Man(null,1,null);
        Woman woman1 = new Woman(null,1,null);
        Woman woman2 = new Woman(null,1,null);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }

    //напишите тут ваш код
    public static class Man {
        public String name;
        public int age;
        public String address;

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        public String name;
        public int age;
        public String address;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
