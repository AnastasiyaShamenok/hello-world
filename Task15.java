package homework3;

//Создать последовательность случайных чисел, найти и вывести наибольшее из них.

public class Task15 {
    public static void main(String[] args) {
        int arr [] = {1,37,64,32,456};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

