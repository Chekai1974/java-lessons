package hw13a10a2022.firstLevel;

public class Number3 {
    public static void main(String[] args) {
        for (int i = 10; i <100; i++) {
            if(i % 4==0 && i % 6 !=0){
                System.out.println(i);
            }
        }
    }
}
