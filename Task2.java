package homework3;
//Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int x=24;
        for (int i = 0; i < x / 3; i++)
            a *= 2;
            System.out.println(a);
        }
    }

