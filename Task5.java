package homework3;

//Напишите программу печати таблицы
//перевода расстояний из дюймов всантиметры
// для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class Task5 {
    public static void main(String[] args) {
        // double arr [][]= double new [1][20];
        double a =2.54;
        System.out.println("Дюймы"+ "\t" + " "+ "Сантиметры");
        for (double i = 1; i <= 20;++i) {
            System.out.println(i +"\t" + " "+ i*a);
        }
    }
}
