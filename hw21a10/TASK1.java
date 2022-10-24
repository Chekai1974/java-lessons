package hw21a10;

public class TASK1 {
    public static void main(String[] args) {
        int startPalindrome=1000;
        int finishPalindrome=9999;
        for (int i = startPalindrome; i < finishPalindrome; i++) {
            int a =i%10;
            int b =i/10%10;
            int c =i/100%10;
            int d =i/1000%10;
            if (d != c && d !=b && d !=a && c!=d && c!=b && c!=a && b!=d && b !=c && b !=a && a !=c && a !=b && a !=d){
                System.out.println(i);
            }
        }
    }
}
