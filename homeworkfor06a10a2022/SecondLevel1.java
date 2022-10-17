package homeworkfor06a10a2022;

import java.util.Scanner;

public class SecondLevel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number");
        int a = scanner.nextInt();
        System.out.println("Second number");
        int b = scanner.nextInt();
        System.out.println("Third number");
        int c = scanner.nextInt();
        formula(a, b, c);
    }
     static void formula(int a, int b, int c){
         if (a > b && a > c) {
             System.out.println(a);
         } else if (c > b) {
             System.out.println(c);
         } else if (b > c) {
             System.out.println(b);
         }
    }
}