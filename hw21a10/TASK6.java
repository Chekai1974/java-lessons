package hw21a10;

import java.util.Scanner;

public class TASK6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = m; i <=n; i++) {
            for (int j = 2; j <i; j++) {
                if(i%j==0){
                    System.out.println(i +" Divider " + j);
                }
            }
        }
    }
}

