package hw13a10a2022.secondLewel;

public class SeсondLevel4 {
    public static void main(String[] args) {
        String str ="123";
        int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        int sum=0;
        for (int i = a; i <=str.length(); i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
