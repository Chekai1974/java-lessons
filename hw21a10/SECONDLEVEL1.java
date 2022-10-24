package hw21a10;

public class SECONDLEVEL1 {
    public static void main(String[] args) {
        double capital = 100;
        double sum = 0;
//        for (int i = 1; i <=10; i++) {
//            sum=capital+capital*0.12*i;
//            System.out.println(sum);
//        }
//        System.out.println("");
//        for (int i = 1; i <=10; i++) {
//           capital=capital+capital*0.12;
//           System.out.println(capital);
//       }
        System.out.println("");
        for (int i = 1; i <=12; i++) {
            capital=capital+(capital*0.01);
            System.out.println(capital);
        }
    }
}
