package hw25a10;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random= new Random();
        int A[] = new int[101];
        for (int i = 1; i <A.length; i++) {
            A[i]=random.nextInt(100);
            System.out.println(A[i]+"*2" + "=" + A[i]*2);
        }
    }
}
