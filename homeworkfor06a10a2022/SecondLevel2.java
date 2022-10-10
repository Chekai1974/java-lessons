package homeworkfor06a10a2022;

import java.util.Scanner;

public class SecondLevel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workTime = scanner.nextInt();
    }
    static void lastTime(int workTime){
        if (workTime < 3599){
            System.out.println("Вы проработали меньше часа, осталость примерно 8 часов");
        }
        if (workTime > 3600 && workTime < 7199) {
            System.out.println("Вы проработали 1 час, осталось работать примерно 7 часов");
        }
        if (workTime > 7199 && workTime < 10800) {
            System.out.println("Вы проработали 2 часа, осталось работать примерно 6 часов");
        }
        if (workTime >10800 && workTime < 14400) {
            System.out.println("Вы проработали 3 часа, осталось работать примерно 5 часов");
        }
        if (workTime > 14400 && workTime < 18000) {
            System.out.println("Вы проработали 4 часа, осталось работать примерно 4 часа");
        }
        if (workTime > 18000 && workTime < 21600){
            System.out.println("Вы проработали 5 часов, осталось работать примерно 3 часа");
        }
        if (workTime > 21600 && workTime < 25200){
            System.out.println("Вы проработали 6 часов, осталось работать примерно 2 часа");
        }
        if (workTime > 25200 && workTime < 28800){
            System.out.println("Вы проработали 7, осталось работать примерно 1 час");
        }
        if (workTime > 28800){
            System.out.println("Рабочий день завершился");
        }
    }
}
