package hw18a10;

import java.util.Random;

public class SumOfAllDigits {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(899)+100;
        System.out.println(number);
        int sumDigit=0;
        while(number != 0){
            sumDigit += (number % 10);
            number/=10;
        }
        System.out.println(sumDigit);
    }
}

