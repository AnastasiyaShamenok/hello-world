public class TimePrinter {
    public static void main(String[]args){
        int a=4500;
        int sec=a%60;
        int m=(a-sec)/60;
        int min= m%60;
        int h=(m-min)/60;
        int day=h/24;
        int week= day/7;
        System.out.println(week+ "недель" + day +"дней"+ h+"часов" +min+"минут" +sec +"секунд");

    }

}
