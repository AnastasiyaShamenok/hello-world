package homework3;

//Имеется целое число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.

import java.util.Random;
public class Task10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(89);
        int a = x % 10;
        int b = x % 100;
        if (a == 1 && b != 11) {
            System.out.println(x + "рубль");
        } else if (a == 2 || a == 3 || a == 4 &&! (b==12 && b==13 && b==14) ) {
            System.out.println(x + "рубля");
        } else{
            System.out.println(x + "рублей");
        }
    }
}

