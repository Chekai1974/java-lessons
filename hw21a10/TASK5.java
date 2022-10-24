package hw21a10;

import java.util.Scanner;

public class TASK5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = 0;
        int middleDigit = 0;
        int suma = 0;
        int x = scanner.nextInt();
        while (x>=2){
            x= scanner.nextInt();
            number++;
        }
        System.out.println(number+1);
    }
}
