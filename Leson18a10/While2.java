package Leson18a10;

import java.util.Random;

public class While2 {
    public static void main(String[] args) {
        Random random= new Random();
        int number=random.nextInt(10000);
        int sum = 0;
        System.out.println(number);
        while (number>0){
           int digit = number % 10;
           sum+= digit;
           number /=10;
        }
        System.out.println(sum);
    }
}
