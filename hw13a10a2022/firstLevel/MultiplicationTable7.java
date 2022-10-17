package hw13a10a2022.firstLevel;

import java.util.Scanner;

public class MultiplicationTable7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (first >9 && second > 9){
            System.out.println("Error "+"\n" +"Только однозначые числа");
            return;
        }
        System.out.println("Введите результат умножения первого числа на второе");
        int result = scanner.nextInt();
        int res = first * second;
        if (result != res){
            System.out.println("Неверно "+ "\n" + "Правельний ответ "+ res);
        }else if (result == res){
            System.out.println("Верно");
        }
    }
}
