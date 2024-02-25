package String;

import java.util.HashSet;
import java.util.Set;

public class CountConsistentStrings {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","d","ab","ac","bc","abc", "abcd"};
        System.out.println("The Number of Consistent Strings are "+ countConsistentStrings(allowed, words));

    }

    private static int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;

        Set<Character> set = new HashSet<Character>();
        for(char letter: allowed.toCharArray()) {
            set.add(letter);
        }

        for(String word: words) {
            for(int i = 0; i < word.length(); i++) {
                if(!set.contains(word.charAt(i))) {
                    count --;
                    break;
                }
            }
        }
        return count;
    }
}
