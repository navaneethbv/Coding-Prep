package String;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println("The string in reverse is "+reverse(string));
    }
    static String reverse (String string) {
        int i = 0;
        int j = string.length() - 1;
        char[] val = string.toCharArray();

        while (i <= j) {
            char temp;
            temp = val[i];
            val[i] = val[j];
            val[j]= temp;
            i++;
            j--;
        }
        return new String(val);
    }
}
