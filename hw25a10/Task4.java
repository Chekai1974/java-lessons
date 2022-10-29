package hw25a10;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] degree = new int [24];
        Random random = new Random();
        for (int i = 8; i <21; i++) {
            degree[i]=random.nextInt(10)-3;
            System.out.println(degree[i]);
        }

        int time = 0;
        for (int i = 8; i < 21; i++) {
            if (degree[i]<0){
                time=i;
                break;
            }
        }
        System.out.println(time);
    }
}
