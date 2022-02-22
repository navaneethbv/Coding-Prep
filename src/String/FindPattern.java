package String;

import java.util.Arrays;

public class FindPattern {
    public static void main(String[] args) {
        /*String string = "Hello";
        String pattern = "llo";*/

        /*String string = "World";
        String pattern = "Doodle";*/

        String string = "Malayalam";
        String pattern = "aya";

        if(findPattern(string, pattern) != -1) {
            System.out.println("Pattern found at index "+findPattern(string, pattern));
        } else {
            System.out.println("No Pattern found");
        }
    }

    public static int findPattern(String s, String p) {
        int index = s.indexOf(p);
        return index;
    }
}
