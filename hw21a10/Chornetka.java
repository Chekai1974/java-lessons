package hw21a10;

import java.util.Scanner;

public class Chornetka {
    public static void main(String args[]){
        System.out.print("Вводите ваше натуральное число - ");
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        System.out.print("Число " + n + " делится на - " );
        for(int i = 2; i < n; i++){
            if (n % i == 0){
                System.out.print(i+ " ");
            }
        }
    }
 }
