package homeworkfor06a10a2022;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageperson = scanner.nextInt();
        boolean age = age(ageperson);
        if (age){
        System.out.println("You can watch films");
        } else {
            System.out.println("You can't watch films");
        }
    }
    static boolean age(int ageperson){
        return ageperson > 17;
    }
}
