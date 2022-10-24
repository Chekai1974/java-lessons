package hw21a10;

import java.util.Scanner;

public class SECONDLEVEL2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int x = 3;
        int sum=0;
        int sum2=0;
        while (x>2){
            number++;
            x= scanner.nextInt();
            sum=sum+x;
        }
        System.out.println(number);
        System.out.println(sum);
        System.out.println((double) sum/number);
    }
}
