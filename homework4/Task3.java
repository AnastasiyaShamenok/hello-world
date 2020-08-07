package homework4;

// Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с текстом");
        String sentence = sc.nextLine();
        sentence = sentence.replaceAll("[!.,:;-]", "");
        String[] words = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();
        for(String word : words) {
            newSentence.append(word.charAt(word.length()-1));
        }
        System.out.println(newSentence);
    }
}
