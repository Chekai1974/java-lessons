package hw13a10a2022.secondLewel;

import java.util.Scanner;

public class SecondLevel3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(factorial(a));
    }
    public static int factorial(int b){
        if(b==1)return 1;
        return b * factorial(b-1);
    }
}
