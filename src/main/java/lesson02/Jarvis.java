package lesson02;

public class Jarvis {

    //String firstGuest = "Retro";
    //String secondGuest = "Tony Stark";


    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.sayHi("Retro", "Hulk", "Spiderman");
        //jarvis.sayHi (jarvis.firstGuest, jarvis.secondGuest);
        //jarvis.sayHi (jarvis.secondGuest);
    }

    public void sayHi(String...names){
        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }

    /*
    public void sayHi(String firstGuest) {
        System.out.println("Добрый вечер, " + firstGuest + ", как ваши дела?");
    }

    public void sayHi(String firstGuest, String secondGuest) {      //перегрузка методов
        System.out.println("Добрый вечер, " + firstGuest + ", " + secondGuest + ", как ваши дела?");
    }
     */

}
