package hw13a10a2022.firstLevel;

public class CheckNumber2 {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(result(6));
    }
    public static boolean result(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
      }
    }
