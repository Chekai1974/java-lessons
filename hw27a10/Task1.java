package hw27a10;

public class Task1 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        for (int val : num) {
            switch (val){
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Весна");
                    break;
                case 3:
                    System.out.println("Літо");
                    break;
                case 4:
                    System.out.println("Осінь");
                    break;
            }
        }
    }
}
