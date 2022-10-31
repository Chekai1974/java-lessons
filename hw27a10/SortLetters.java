package hw27a10;

import java.util.Arrays;

public class SortLetters {
    public static void main(String[] args) {
        char[] first ={'a','b','c','d','e'};
        char[] second ={'f','g','h','i','j'};
        char[] result = new char[first.length+second.length];
        for (int i = 0; i < first.length; i++) {
            result[i]=first[i];
        }
        for (int i = 0; i < second.length; i++) {
            result[i+first.length]=second[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
