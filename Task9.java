package homework3;

//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.

public class Task9 {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int r = 2;
        if (r * r <= (a * a + b * b) / 4) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }
    }
}

