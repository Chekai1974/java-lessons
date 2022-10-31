package hw27a10;

public class ArrayNumber {
    public static void main(String[] args) {
        int[] arr = {5, 13, 7, 1, 34};
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 1) {
                a++;
            }else
                b++;
        }
        if (a>b){
            System.out.println("Більше парних");
        }else
            System.out.println("Більше не парных");
    }
}
