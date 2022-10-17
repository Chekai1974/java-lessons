package hw13a10a2022.firstLevel;

public class Number6 {
    public static void main(String[] args) {
        for (int i = 13; i <100; i++) {
            if(i % 2 !=0 && i % 13 ==0){
                System.out.println(i);
            }
        }
    }
}
