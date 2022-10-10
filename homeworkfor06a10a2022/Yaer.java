package homeworkfor06a10a2022;

import java.util.Scanner;

public class Yaer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        leapOrNot(scanner.nextInt());
    }
    static void leapOrNot(int year){
        if (year % 4 ==0) {
            System.out.println("This year is a leap year");
        }else {
            System.out.println("This year isn't a leap year");
        }
    }
}
