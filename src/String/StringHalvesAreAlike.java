package String;

public class StringHalvesAreAlike {
    public static void main(String[] args) {
        String value = "book";
        //System.out.println(value.indexOf('o'));

        System.out.println("Is the String halves alike - "+halvesAreAlike(value));
    }
    public static boolean halvesAreAlike(String s) {
        String one = s.substring(0, (s.length() / 2));
        String two = s.substring(s.length() / 2, s.length());
        if(countVowels(one) == countVowels(two))
            return true;
        return false;
    }

    public static int countVowels(String val) {
        int count = 0;
        for(char ch: val.toCharArray()) {
            if((ch == 'A') || (ch == 'E') || (ch == 'O') || (ch == 'I') || (ch == 'U') || (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'u') || (ch == 'o')) {
                count ++;
            }
        }
        return count;
    }
}
