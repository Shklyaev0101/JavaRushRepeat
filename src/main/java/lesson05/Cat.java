package lesson05;

/**
 * Создание кота (1)
 *
 * Создать класс Cat.
 * У кота должно быть имя (name, String),
 * возраст (age, int),
 * вес (weight, int),
 * сила (strength, int).
 *
 * Требования:
 * •	Программа не должна считывать данные с клавиатуры.
 * •	У класса Cat должна быть переменная name с типом String.
 * •	У класса Cat должна быть переменная age с типом int.
 * •	У класса Cat должна быть переменная weight с типом int.
 * •	У класса Cat должна быть переменная strength с типом int.
 * •	Всего в классе должно быть 4 переменных.
 */

/**
 * Реализовать метод fight (2)
 *
 * Реализуй метод boolean fight(Cat anotherCat):
 * продумай механизм драки котов в зависимости от их веса, возраста и силы.
 * Сравни каждый критерий по отдельности, чтобы победителем был тот,
 * у кого были лучшие показатели по большинству критериев.
 * Метод должен определять, выиграли ли мы (this) бой или нет,
 * т.е. возвращать true, если выиграли и false - если проиграли.
 * Если ничья и никто не выиграл, возвращаем false.
 *
 * Требования:
 * •	Класс Cat должен содержать конструктор без параметров.
 * •	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
 * •	В классе Cat должен быть метод fight.
 * •	В методе fight реализовать механизм драки котов в зависимости от их веса,
 *      возраста и силы согласно условию.
 * •	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
 * •	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
 *
 */


public class Cat {
    //напишите тут ваш код (1)
    //public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int CatPoints = 0;
        int anotherCatPoints = 0;

        if (this.strength == anotherCat.strength &&
                this.weight == anotherCat.weight &&
                this.age == anotherCat.age) {
            CatPoints++;
            anotherCatPoints++;
        }
        if (this.strength == anotherCat.strength &&
                this.weight > anotherCat.weight &&
                this.age > anotherCat.age) {
            CatPoints++;
        } else if (this.strength == anotherCat.strength &&
                this.weight < anotherCat.weight &&
                this.age < anotherCat.age) {
            anotherCatPoints++;
        }
        if (this.strength == anotherCat.strength &&
                this.weight < anotherCat.weight &&
                this.age > anotherCat.age) {
            CatPoints++;
            anotherCatPoints++;
        } else if (this.strength == anotherCat.strength &&
                this.weight > anotherCat.weight &&
                this.age < anotherCat.age) {
            CatPoints++;
            anotherCatPoints++;
        }
        if (this.strength > anotherCat.strength &&
                this.weight == anotherCat.weight &&
                this.age > anotherCat.age) {
            CatPoints++;
        } else if (this.strength < anotherCat.strength &&
                this.weight == anotherCat.weight &&
                this.age < anotherCat.age) {
            anotherCatPoints++;
        }
        if (this.strength > anotherCat.strength &&
                this.weight == anotherCat.weight &&
                this.age < anotherCat.age) {
            CatPoints++;
            anotherCatPoints++;
        } else if (this.strength < anotherCat.strength &&
                this.weight == anotherCat.weight &&
                this.age > anotherCat.age) {
            CatPoints++;
            anotherCatPoints++;
        }
        if (this.strength > anotherCat.strength &&
                this.weight > anotherCat.weight &&
                this.age == anotherCat.age) {
            CatPoints++;
        } else if (this.strength < anotherCat.strength &&
                this.weight < anotherCat.weight &&
                this.age == anotherCat.age) {
            anotherCatPoints++;
        }
        if (this.strength > anotherCat.strength &&
                this.weight < anotherCat.weight &&
                this.age == anotherCat.age) {
            CatPoints++;
            anotherCatPoints++;
        } else if (this.strength < anotherCat.strength &&
                this.weight > anotherCat.weight &&
                this.age == anotherCat.age) {
            CatPoints++;
            anotherCatPoints++;
        }
        if (this.strength == anotherCat.strength &&
                this.weight > anotherCat.weight &&
                this.age == anotherCat.age) {
            CatPoints++;
        } else if (this.strength == anotherCat.strength &&
                this.weight < anotherCat.weight &&
                this.age == anotherCat.age) {
            anotherCatPoints++;
        }
        if (this.strength == anotherCat.strength &&
                this.weight == anotherCat.weight &&
                this.age > anotherCat.age) {
            CatPoints++;
        } else if (this.strength == anotherCat.strength &&
                this.weight == anotherCat.weight &&
                this.age < anotherCat.age) {
            anotherCatPoints++;
        }
        if (this.strength > anotherCat.strength &&
                this.weight == anotherCat.weight &&
                this.age == anotherCat.age) {
            CatPoints++;
        } else if (this.strength < anotherCat.strength &&
                this.weight == anotherCat.weight &&
                this.age == anotherCat.age) {
            anotherCatPoints++;
        }
        if (this.strength > anotherCat.strength &&
                this.weight > anotherCat.weight &&
                this.age > anotherCat.age) {
            CatPoints++;
        } else if (this.strength < anotherCat.strength &&
                this.weight < anotherCat.weight &&
                this.age < anotherCat.age) {
            anotherCatPoints++;
        }
        if (this.strength > anotherCat.strength &&
                this.weight < anotherCat.weight &&
                this.age > anotherCat.age) {
            CatPoints++;
        } else if (this.strength < anotherCat.strength &&
                this.weight > anotherCat.weight &&
                this.age < anotherCat.age) {
            anotherCatPoints++;
        }
        if (this.strength > anotherCat.strength &&
                this.weight > anotherCat.weight &&
                this.age < anotherCat.age) {
            CatPoints++;
        } else if (this.strength < anotherCat.strength &&
                this.weight < anotherCat.weight &&
                this.age > anotherCat.age) {
            anotherCatPoints++;
        }
        if (this.strength < anotherCat.strength &&
                this.weight > anotherCat.weight &&
                this.age > anotherCat.age) {
            CatPoints++;
        } else if (this.strength > anotherCat.strength &&
                this.weight < anotherCat.weight &&
                this.age < anotherCat.age) {
            anotherCatPoints++;
        }

        if (CatPoints > anotherCatPoints) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
    }

}
