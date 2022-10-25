package lesson02;

/*
Макс, Белла и Джек
Создать 3 объекта типа Dog (собака).
Сохрани каждый экземпляр в отдельную переменную.
Присвоить им имена "Max", "Bella", "Jack".

Requirements:
1. Программа не должна выводить текст на экран.
2. В методе main должно быть только три переменные типа Dog.
3. Переменным сразу должны быть присвоены значения.
4. Каждому объекту типа Dog должно быть присвоено имя.
5. В классе Dog должна быть одна переменная name.
6. В классе Dog не должно быть методов.
 */

public class task0209 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";

        Dog dog2 = new Dog();
        dog2.name = "Bella";

        Dog dog3 = new Dog();
        dog3.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
