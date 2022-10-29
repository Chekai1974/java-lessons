package hw25a10;

import java.util.Arrays;

public class SecondLevel2 {
    public static void main(String[] args) {
        int[] arr = {3,6,7,8,3,5,1,};
        int sum = 0;
        double medium=0.0;
        for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        medium = sum / arr.length;
        System.out.println("Medium= "+ medium);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>medium){
                System.out.println(arr[i]);
            }
        }
    }
}
