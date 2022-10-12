package hw11a10a2022;

import java.util.Scanner;

public class EntranceRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrance = scanner.nextInt();
        if (entrance < 21){
            System.out.println("1 entrance");
        }
        if (entrance > 21 && entrance < 48){
            System.out.println("2 entrance");
        }
        if (entrance > 48 && entrance < 90){
            System.out.println("3 entrance");
        }
        else if(entrance == 0 || entrance > 90){
            System.out.println("Error");
        }
    }
}
