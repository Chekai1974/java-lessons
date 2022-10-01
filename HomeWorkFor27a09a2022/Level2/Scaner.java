package HomeWorkFor27a09a2022.Level2;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Как вас зовут:");
        String name = scan.nextLine();
        System.out.println("Hello " + name);

//      __________________________________

        Scanner scaner = new Scanner(System.in);
        System.out.println("Ваше имя:");
        String names = scaner.nextLine();
        System.out.println("Ваше имя начинаеться с буквы " + names.substring(0, 1));

//      __________________________________

        double a = 59.976;
        int b = (int) Math.round(a);
        System.out.println(b);

//      __________________________________

        int x = 475;
        short z = (short) x;
        System.out.println(z);


    }
}