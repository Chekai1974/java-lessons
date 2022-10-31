package hw27a10;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (b+c>a && a+c>b && a+b>c){
            System.out.println("Yeas");
        }else
            System.out.println("Can't");
    }
}
