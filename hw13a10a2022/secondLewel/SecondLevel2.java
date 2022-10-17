package hw13a10a2022.secondLewel;

public class SecondLevel2 {
    public static void main(String[] args) {
        int sum = 0;
        int index = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 !=0){
                sum = (sum + i);
            index++;
            }
        }
        System.out.println(sum/index);
    }
}
