package arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        if(isAnagram(s, t)) {
            System.out.println("The given Strings " + s + " and " + t + " are anagrams");
        } else {
            System.out.println("The given Strings " + s + " and " + t + " are not anagrams");
        }
    }

    public static boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0; i < ch1.length; i++) {
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }

}
