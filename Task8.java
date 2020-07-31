package homework3;

// Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.

public class Task8 {
    public static void main(String[] args) {
        int a = 75;
        int b = a % 10;
        int c = a % 2;
        if (a >= 100 && a < 1000) {
            System.out.println("Число является трёхзначным");
        }
        if (a % 2 == 0) {
            System.out.println("Число является чётным");
        }
        if (a % 10 == 7) {
            System.out.println("Последняя цифра числа является семеркой");
        } else {
            System.out.println("Число не проходит проверку ни по одному критерию");
        }
    }
}


