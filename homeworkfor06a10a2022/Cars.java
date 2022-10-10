package homeworkfor06a10a2022;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day?");
        boolean isWeekend = scanner.nextBoolean();
        System.out.println("Your number?");
        int numbers = scanner.nextInt();
        System.out.println("Your type?");
        boolean lorry = scanner.nextBoolean();
        result(numbers, lorry, isWeekend);
        }
    static boolean result(int numbers, boolean lorry, boolean isWeekend){
        if (numbers < 10000 && !lorry && numbers % 2 == 0 && isWeekend){
            System.out.println("You can enter!1");
            return true;
        }
        if (isWeekend && numbers < 10000 && lorry){
            System.out.println("You can enter!2");
            return false;
        }
        if (!isWeekend && numbers < 10000 && lorry){
            System.out.println("You can't enter you lorry!");
            return false;
        }
        if (numbers > 10000 || numbers % 2 != 0){
                System.out.println("You can't enter your number not correct");
                return false;
        }
        if (numbers < 1000 && numbers % 2 ==0 && isWeekend || !isWeekend){
            System.out.println("You can enter!3");
            return true;
        }
        else return lorry;
    }
}
