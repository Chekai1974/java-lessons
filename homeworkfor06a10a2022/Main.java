package homeworkfor06a10a2022;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        checkEagleTail(random.nextBoolean());
    }
    static void checkEagleTail(boolean type){
        if(type)
            System.out.println("eagle");
        else System.out.println("tail");
    }

}
