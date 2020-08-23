package homework4;
// Найти в строке не только запятые,но и друге знако препинания. Подсчитать их общее количество.

public class Task1 {
    public static void main(String[] args) {
        String str = "Он, однако ж, не то чтоб уж был совсем в беспамятстве во всё время болезни: это было лихорадочное состояние, с бредом и полусознанием.";
        int n=0;
        char symbol;
        for(int i=0;i<str.length();i++){
            symbol=str.charAt(i);
            if(symbol ==',' || symbol =='-' || symbol ==':' || symbol =='.' ){
                n++;
            }
        }
        System.out.println("У нас есть"+ " "+ n+ " "+ "знаков препинания");
    }
}
