package hw13a10a2022.firstLevel;

import java.util.Scanner;

public class CheckLeapYear1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstYear = scanner.nextInt();
        int secondYear = scanner.nextInt();
        int index = 0;
        for (int i = firstYear; i <= secondYear; i++){
            if(i % 4 ==0 ){
                index++;
                System.out.println(i);
          }
        }
        System.out.println(index);
    }
}
