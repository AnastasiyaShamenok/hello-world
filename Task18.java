package homework3;

//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.

public class Task18 {
    public static void main(String[] args) {
        int value [] = {4,6,0,5,6,17,10,3};
        System.out.println("Максимальное значение" + " " + findMaxIndex(value));
        System.out.println("Минимальное значение" + " " + findMinIndex(value));

        System.out.println(calculateSumBetween(value));
    }

    public static int calculateSumBetween(int[] value) {
        int minIndex = findMinIndex(value);
        int maxIndex = findMaxIndex(value);
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += value[i];
        }
        return result;
    }

    public static int findMinIndex(int[] value) {
        int minIndex = 0;
        int minValue = value[minIndex];
        for (int i = 0; i < value.length; i++) {
            if (minValue > value[i]) {
                minValue = value[i];
                minIndex = i;
            }
        }
        return minValue;
    }

    public static int findMaxIndex(int[] value) {
        int maxIndex = 0;
        int maxValue = value[maxIndex];
        for (int i = 0; i < value.length; i++) {
            if (maxValue < value[i]) {
                maxValue = value[i];
                maxValue = i;
            }
        }

        return maxValue;
    }
}
