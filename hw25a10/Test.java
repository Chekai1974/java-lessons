package hw25a10;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int maxBound = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(maxBound);
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(min);
    }
}
