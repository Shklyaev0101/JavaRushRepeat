package lesson02;

/*
Музей древностей.
Твоя задача — спроектировать класс Artifact.

Артефакты, которые хранятся в музее, бывают трех видов.

Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан,
и точный век его создания (например: 212121, "Ацтеки", 12).

Создай класс Artifact, описывающий хранящиеся в музее древности,
и напиши необходимое количество конструкторов для него. В методе main() создай по одному артефакту каждого вида.
 */

public class Artifact {

    int serialNumb;
    String culture;
    int exactAge;

    static int count =0;

    public static void main(String[] args) {
        Artifact artifact = new Artifact(210021);
        Artifact artifact2 = new Artifact(210022, "Римляне", 1);
        Artifact artifact3 = new Artifact(210023, "Русичи");

    }

    public Artifact(int serialNumb) {
        count++;
        this.serialNumb = serialNumb;
    }

    public Artifact(int serialNumb, String culture) {
        count++;
        this.serialNumb = serialNumb;
        this.culture = culture;
    }

    public Artifact(int serialNumb, String culture, int exactAge) {
        count++;
        this.serialNumb = serialNumb;
        this.culture = culture;
        this.exactAge = exactAge;
    }

}
