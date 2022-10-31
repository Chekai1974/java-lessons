package hw27a10;

public class HowToFindCountWordsInSentens {
    public static void main(String[] args) {
        String str = "Привет как дела?";
        int count = 0;
        if (str.length()!=0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
