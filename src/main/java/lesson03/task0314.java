package lesson03;

/*
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...

Requirements:
1. Программа должна выводить текст.
2. Выведенный текст должен содержать 10 строк.
3. Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
4. Выведенные числа должны быть таблицей умножения.
 */

public class task0314 {
    public static void main(String[] args) {
        //Выводим значение второго множителя в строке
        System.out.println("   2 3 4 5 6 7 8 9");
        }
       /* int i = 2;  //первый множитель, присваиваем стартовое значение
         while (i < 10) {   //первый цикл, выполняем пока первый множитель меньше 10
             System.out.print(i + " | "); //выводим первый множитель в начало строки
             int j = 2;     //второй множитель, стартовое значение
             while (j < 10) {   //второй цикл, выполняем пока второй множитель меньше 10
                 int mul = i * j;   //считаем произведение множителей
                 if (mul < 10)   //если содержит одну цифру - после него выводим два пробела
                     System.out.print(mul + " ");
                 else  //иначе выводим произведение и после него - один пробел
                     System.out.print(mul + " ");
                     j++;    //увеличиваем на единицу второй множитель,
                            //переходим к началу второго цикла (while (j<10)...)
             }
             System.out.println();  //перейдем на следующую строку вывода
             i++;                   //увеличиваем на единицу второй множитель,
                                    //переходим к началу первого цикла

        */
}