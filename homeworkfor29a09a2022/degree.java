package homeworkfor29a09a2022;

import java.util.Scanner;

public class degree {
    public static void main(String[] args) {
        Scanner scanC = new Scanner(System.in);
        System.out.println("Degree in C°:");
        Integer degreeC = scanC.nextInt();
        int resultF = (int) Math.round(degreeC * 1.8 + 32);
        System.out.println(degreeC + "C° = " + resultF + "F°");

//      ___________________________________________________

        Scanner scanF = new Scanner(System.in);
        System.out.println("Degree in F°:");
        Integer degreeF = scanF.nextInt();
        int resultC = (int) Math.round((degreeF - 32) / 1.8);
        System.out.println(degreeF + "F° = " + resultC + "C°");
    }
}
