package homework3;

//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).

public class Task17 {
    public static void main(String[] args) {
        int i;
        int n = 5;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 7);
            System.out.print(" " + arr[i]);
        }
        System.out.println(" " + "Перевернутый массив");
        for (i = 0; i < n / 2; i++) {
            int b = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = b;
        }
        System.out.println(" \n ");
        for (i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
