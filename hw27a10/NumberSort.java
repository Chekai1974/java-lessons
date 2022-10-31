package hw27a10;

import java.util.Arrays;

public class NumberSort {
    public static void main(String[] args) {
        int [] arr = {5,13,67,34,3,98,6};
        Arrays.sort(arr);
        int a =0;
        for (int i =arr.length -1; i > 0; i--) {
            a=arr[i];
            System.out.println(a);
        }
    }
}
