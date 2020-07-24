package homework3;

//Найдите сумму первых n целых чисел, которые делятся на 3.

public class Task14 {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        int k=0;
        for (int i = 1; k < n; i++) {
            if (i % 3 == 0) {
                sum += i;
                k++;
            }
        }
            System.out.println(sum);
            }
        }
