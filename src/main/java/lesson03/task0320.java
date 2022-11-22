package lesson03;

/*
Полнометражная картина
Реализуй метод getMetreFromCentimetre(int centimetre). Метод на вход принимает количество сантиметров.
Нужно сделать так, чтобы метод возвращал число полных метров в centimetre. (1 метр = 100 см).

Пример:
Метод getMetreFromCentimetre вызывается с параметром 243.

Пример вывода:
2

Requirements:
1. Программа не должна cчитывать данные с клавиатуры.
2. Метод getMetreFromCentimetre(int) должен быть публичным и статическим.
3. Метод getMetreFromCentimetre должен возвращать значение типа int.
4. Метод getMetreFromCentimetre не должен ничего выводить на экран.
5. Метод getMetreFromCentimetre должен правильно возвращать количество полных метров в centimetre.
 */

public class task0320 {
    public static void main(String[] args) {

        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int metr = centimetre/100;
        return metr;
    }
}