package hw25a10;

import java.util.Arrays;
import java.util.Random;

public class SecondLevel3 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50)+1;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}
