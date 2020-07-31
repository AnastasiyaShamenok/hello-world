package homework3;

//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.

public class Task11 {
    public static void main(String[] args) {
        int b=5;
        for (int i=1;i<=5;i++){
            b=b*i;
        }
        int c=3;
        for (int j=1;j<=3;j++){
            c=c*j;
        }
        int a = b+c;
        System.out.println(a);
    }
}
