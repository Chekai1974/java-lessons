package hw11a10a2022;

import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(9_999)+1;
        int inter = number % 10;
        switch (inter){
            case 1:
                System.out.println(number + " долар");
                break;
            case 2:
                System.out.println(number + " долара");
                break;
            case 3:
                System.out.println(number + " долара");
                break;
            case 4:
                System.out.println(number + " долара");
                break;
            case 5:
                System.out.println(number + " доларов");
                break;
            case 6:
                System.out.println(number + " доларов");
                break;
            case 7:
                System.out.println(number + " доларов");
                break;
            case 8:
                System.out.println(number + " доларов");
                break;
            case 9:
                System.out.println(number + " доларов");
                break;

        }
    }
}
