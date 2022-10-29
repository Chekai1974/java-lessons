package hw25a10;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int number[] = new int[length];
        for (int i = 0; i <length; i++) {
            number[i]=scanner.nextInt();
        }

        for (int i= 0; i < number.length; i++) {
            System.out.println("Module "+ Math.abs(number[i]));
        }
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (max<number[i]){
                max = number[i];
            }
        }
        System.out.println("Max "+max);
    }
}
