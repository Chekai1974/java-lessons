package hw21a10;

public class SECONDLEVEL3 {
    public static void main(String[] args) {
        int number = 3;
        while (number%2!=0 && number>1){
             number=(number*3-1)/2;
             if (number==1){
                 break;
             }
         }
        while (number%2==0 && number>1){
            number=number/2;
            if (number==1){
              break;
            }
        }
    }
}
