public class InverseNumber {
    public static void main(String[] args) {
        int n=7865;
        String str = Integer.toString(n);
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);
    }
}



