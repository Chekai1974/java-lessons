package hw27a10;

public class SumAllNumberLike321 {
    public static void main(String[] args) {
        int a = 322;
       int sum=0;
        for (int i = 1; i <=a; i++) {
            if(a>0){
               sum+=a%10;
               a=a/10;
            }
        }
        System.out.println(sum);
    }
}
