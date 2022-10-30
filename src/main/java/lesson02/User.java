package lesson02;

/*
Сайт знакомств
Вы создаете базу данных пользователей для сайта знакомств.

Да вот беда — вы подзабыли в каком порядке их нужно указывать, а технического задания под рукой нет.

Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).

Создайте для него необходимое количество конструкторов, чтобы имя, возраст и рост можно было указывать в любом порядке.
 */

public class User {
    String name;
    short age;
    int height;

    public static void main(String[] args) {
        /*
        User user = new User("Vasia", 20, 180);
        User user2 = new User(22, "Oleg", 176);
        User user3 = new User(165, "Jack", 34);
        */
        // необходимо выяснить, что не работает (вернуться позже)
    }

    public User (String name, short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User (short age,String name,int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public User ( int height,String name,short age) {
        this.height = height;
        this.name = name;
        this.age = age;

    }
}
