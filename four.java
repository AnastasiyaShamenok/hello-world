//Даны 3 целых числа. Найти количество положительных чисел в исходномнаборе.


public class four {
    public static void main(String[] args) {
        int[] num = {8, 10, -5};
        int countPositive = 0;
        for(int c = 0; c < num.length; c++) {
           if(num[c] > 0) {
                countPositive++;
            }
        }
        System.out.printf("Положительных: %d%n", countPositive);
    }
}
