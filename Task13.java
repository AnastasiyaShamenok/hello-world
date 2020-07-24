package homework3;

//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

public class Task13 {
    public static void main(String[] args) {
        int a = 5;
        boolean com = false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                com = true;
                break;
            }
        }
        if (com) {
            System.out.println("Число составное");
        } else {
            System.out.println("Число простое");
        }
    }
}


