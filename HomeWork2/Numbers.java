package HomeWork2;

public class Numbers {
    public static void main(String[] args) {
        int dec = 637;// 6 * 100 + 3 * 10 + 7 * 1
        int dvo;
        dvo = dec % 2;//1
        dec = dec / 2;//318
        dvo = dec % 2;//0
        dec = dec / 2;//159
        dvo = dec % 2;//0
        dec = dec / 2;//79
        dvo = dec % 2;//1
        dec = dec / 2;//39
        dvo = dec % 2;//1
        dec = dec / 2;//19
        dvo = dec % 2;//1
        dec = dec / 2;//9
        dvo = dec % 2;//1
        dec = dec / 2;//4
        dvo = dec % 2;//1
        dec = dec / 2;//2
        dvo = dec % 2;//0
        dec = dec / 2;//1
        dvo = dec % 2;//1
        dec = dec / 2;//
        dvo = 1001111101;
        System.out.println(" 637 -> В двоичную: " + dvo);

    }
}
