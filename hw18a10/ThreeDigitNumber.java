package hw18a10;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        int number = 485;
        int b = 0;
        while (number>0){
            int digit = number %10;
            if(b <=digit){
               b = digit;
            }
            number /=10;
        }
        System.out.println(b);
    }
}
