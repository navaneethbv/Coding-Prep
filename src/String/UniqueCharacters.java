package String;

import java.util.HashSet;
import java.util.Set;

class UniqueCharacters {
    public static void main(String[] args) {
        String uniqueWord = "mango";
        String nonUniqueWord = "apple";
        if(isUnique(nonUniqueWord)) {
            System.out.println("The given word contains unique characters");
        } else {
            System.out.println("The given word does not contain unique characters");
        }
    }

//    static boolean isUnique(String word) {
//        Set<Character> set = new HashSet<Character>();
//        for(int i = 0 ; i < word.length(); i++) {
//            if(set.contains(word.charAt(i))) return false;
//            set.add(word.charAt(i));
//        }
//        return true;
//    }

    static boolean isUnique(String word) {
        int checker = 0;
        for (int i = 0; i < word.length(); ++i) {
            int val = (word.charAt(i)-'a');
            // If bit corresponding to current
            // character is already set
            if ((checker & (1 << val)) > 0)
                return false;
            // set bit in checker
            checker |= (1 << val);
        }
        return true;
    }
}
