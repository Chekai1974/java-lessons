package hw18a10;

import java.util.Random;

public class SumOfAllDigitsVARIANT2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(899)+100;
            int firstNum = number / 100;
            int secondDivider = number /10;
            int secondNum = secondDivider %10;
            int thirdNum = secondNum % 10;
        System.out.println(number);
            if (firstNum > secondNum && firstNum >thirdNum){
                System.out.println(firstNum);
            }else if (secondNum > firstNum && secondNum > thirdNum){
                System.out.println(secondNum);
            }else
                System.out.println(thirdNum);
    }
}
