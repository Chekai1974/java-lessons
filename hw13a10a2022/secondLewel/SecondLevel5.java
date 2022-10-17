package hw13a10a2022.secondLewel;

public class SecondLevel5 {
    public static void main(String[] args) {
        String str ="123123";
        int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        int b = Integer.parseInt(String.valueOf(str.charAt(1)));
        int c = Integer.parseInt(String.valueOf(str.charAt(2)));
        int d = Integer.parseInt(String.valueOf(str.charAt(3)));
        int e = Integer.parseInt(String.valueOf(str.charAt(4)));
        int f = Integer.parseInt(String.valueOf(str.charAt(5)));
        if (a+b+c==d+e+f){
            System.out.println("Yeas");
        }else
            System.out.println("No");
    }
}
