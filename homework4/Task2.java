package homework4;

//Имеея строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут
//разделяться несколькими пробелами,
//в начале и конце текста также могут быть пробелы, но могут и отсутствовать.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        int count = 0;
        input=input.trim();
        input=input.replaceAll("\\s{2,}", " ");
        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + " " + count + "слов(а)");
    }
}


