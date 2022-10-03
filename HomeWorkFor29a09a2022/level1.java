package HomeWorkFor29a09a2022;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод:");
        String add = scan.nextLine();
        System.out.println("Длина ввода: " + add.length());

//      ______________________________________________________

        String first = "I love ";
        String second = "Java";
        String result = first.concat(second);
        System.out.println(result);

//      _______________________________________________________

        int a = 53;
        int b = 32;
        int c = 12;
        int sum = (a + b + c);
        System.out.println(sum);
    }
}
