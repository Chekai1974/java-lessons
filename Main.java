public class Main {
    public static void main(String[] args) {
        int x = 123;
        int y = x / 100;
        System.out.println(y);
        x = x % 100;
        y = x / 10;
        System.out.println(y);
        System.out.println(y = x % 10);
    }
}
