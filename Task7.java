package homework3;

//Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

public class Task7 {
    public static void main(String[] args) {
        int arr=0;
        for (int i=1;i<=99; i++) {
        if( i%2!=0) {
            arr+=i;
        }
        }
        System.out.println(arr);
    }
}
