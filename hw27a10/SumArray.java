package hw27a10;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int [] arr = {5,13,7,1,34};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int result:arr) {
            sum+=result;
        }
        System.out.println(sum);
    }
}
