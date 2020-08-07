package homework4;

//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.

import java.io.IOException;

public class Task7 {
    public static void main(String[] args) {
        String str = "Привет" + "мир";
        String Str = new StringBuilder().append("Привет").append("мир").toString();
        String sTr = new StringBuffer().append("Привет").append("мир").toString();
        System.out.println(str);
        System.out.println(Str);
        System.out.println(sTr);
        try {
            test(new StringBuffer(""));
            test(new StringBuilder(""));
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }
    }
    private static void test(Appendable obj) throws java.io.IOException {
        long before = System.currentTimeMillis();
        for (int i = 0; i++ < 1e9; ) {
            obj.append("");
        }
        long after = System.currentTimeMillis();
        System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
    }
}