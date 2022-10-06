package homeworkfor04a10a2022;

import java.util.Scanner;

public class Scaner {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer val = scan.nextInt();
        System.out.println(done(val));
        String str = scan.nextLine();
        System.out.println(howe(str));
    }
    static boolean done(Integer val) {
        return val % 7 == 0 && val % 5 == 0;
    }
    static boolean howe(String str) {
        return str.length() > 10;
    }
}