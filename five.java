//Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.
public class five {
    public static void main(String[] args) {
 int[] num = {8, 10, -5};
    int countNegative = 0;
    int countPositive = 0;
        for(int c = 0; c < num.length; c++) {
        if(num[c] < 0) {
            countNegative++;
        } else if(num[c] > 0) {
            countPositive++;
            System.out.printf("Положительных: %d%nОтрицательных: %d%n%n", countPositive, countNegative);
            }
        }

    }
}

