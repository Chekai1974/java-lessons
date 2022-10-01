package HomeWorkFor27a09a2022.Level1;

import java.util.Locale;
import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        String string = "I study Basic Java!";
        char result = string.charAt(18);
        System.out.println(result);
        System.out.println(string.contains("Java"));
        System.out.println(string.replace("a","o"));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase(Locale.ROOT));
        System.out.println(string.substring(14, 18));
        double a = 200.00;
        double b = 470.00;
        System.out.println((a / b) * 100 + "%");
        char c = 'g';
        int d = Character.getNumericValue(c);
        System.out.println(d);
        int e = c;
        System.out.println(e);
//        _____SECOND LEVEL___
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Как вас зовут:");
//        Scanner name = scan;
//        System.out.println("Hello" + name);
    }
}
