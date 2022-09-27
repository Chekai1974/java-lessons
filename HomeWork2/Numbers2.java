package HomeWork2;

public class Numbers2 {
    public static void main(String[] args) {
        int dec = 637;
        int shst;
        shst = dec % 16;//13=D
        dec= dec / 16;//39
        shst = dec % 16;//7
        dec = dec / 16;//2
        System.out.println("Из 10чной в 16ную = 27D\n");
        int first = 2;
        int second = 7;
        int third = 13;
        int a = 16;
        int b = 2;
        int c = 1;
        int d = 0;
        System.out.println(first * Math.pow(a, b) + second * Math.pow(a, c) + third * Math.pow(a, d));
    }
}
