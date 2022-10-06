package HomeWorkFor22a09a2022.homework2.secondlevel;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ширина прямоугольника(для площяди):");
        int a = scan.nextInt();
        System.out.println("Длина прямоугольника(для площяди):");
        int b = scan.nextInt();
        int formula = a * b;
        System.out.println("Пощадь прямоугольника = " + formula);
        System.out.println("Ширина прямоугольника(для периметра):");
        int c = scan.nextInt();
        System.out.println("Длина прямоугольника(для периметра):");
        int d = scan.nextInt();
        int formulaSecond = 2 * (c + d);
        System.out.println("Пощадь прямоугольника = " + formulaSecond);
    }
}
