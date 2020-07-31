package homework3;

//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class Task12 {
    public static void main(String[] args) {
        int result=1;
        for (int i=10;i<=15;i++){
            result = result*i;
        }
        System.out.println(result);
    }
}
