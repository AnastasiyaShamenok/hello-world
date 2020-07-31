package homework3;
// Вычислить: 1+2+4+8+...+256 г.п

public class Task3 {
    public static void main(String[] args) {
        int i;
        int sum=0;
        for(i=1;i<=256;i++) {
            sum+=i;
        }
        System.out.println(sum);
        }
}