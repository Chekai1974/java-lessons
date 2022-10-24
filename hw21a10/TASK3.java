package hw21a10;

import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int hight = scanner.nextInt()+1;
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < hight - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i*2-1; j++) {
                System.out.print("^");
            }
            System.out.println("");
        }
    }
}
