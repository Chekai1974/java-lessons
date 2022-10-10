package homeworkfor06a10a2022;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cookies you wont?");
        int howManyCookies = scanner.nextInt();
        System.out.println("How much money you have?");
        int howMuchMoney = scanner.nextInt();
        int formula = formula(howManyCookies, howMuchMoney);
        if(formula == 0){
            System.out.println("You can buy");
        }else{
            System.out.println("You can't buy");
        }
    }
    static int formula(int howManyCookies, int howMuchMoney){
        return howManyCookies % howMuchMoney;
    }
}
