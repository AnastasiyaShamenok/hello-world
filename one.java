
// В переменную записываем число.
// Надо вывести на экран сколько в этомчисле цифр и положительное оно или отрицательное.
// Например, "этооднозначное положительное число".
// Достаточно будет определить, является личисло однозначным, "двухзначным или трехзначным и более.

public class one {
    public static void main(String[] args) {
        int value = 768;
        if (value >= 0 && value < 10) {
            System.out.println("Это однозначное положительное число");
        } else if (value < 0 && value > -10) {
            System.out.println("Это однозначное отрицательное число");
        }    if (value >= 0 && value >= 10 && value < 100) {
                System.out.println("Это двузначное положительное число");
            } else if (value < 0 && value <= -10 && value > -100) {
                System.out.println("Это двузначное отрицательное число");
            } else if (value >= 0 && value >= 100 && value < 1000) {
                System.out.println("Это трехзначное положительное число");
            } else if (value < 0 && value <= -100 && value > -1000) {
                System.out.println("Это трехзначное отрицательное число");
            } else if (value >= 0 && value >= 1000) {
                System.out.println("Это многозначное положительное число");
            } else
                System.out.println("Это многозначное отрицательное число");
            }
        }



