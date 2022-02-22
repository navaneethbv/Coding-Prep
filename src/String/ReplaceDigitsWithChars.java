package String;

public class ReplaceDigitsWithChars {
    public static void main(String[] args) {
        String string = "a1b2c3e";
        System.out.println("The new string replacing digits with characters is "+replaceDigits(string));
    }

    public static String replaceDigits(String s) {
        String value = s;
        StringBuilder sb = new StringBuilder();
        char val = s.charAt(s.length() - 1);
        if (s.length() % 2 != 0) {
            s = s.substring(0, s.length() - 1);
        } else {
            s = s;
        }
//        System.out.println("String is "+s);
//        System.out.println("Char is "+val);
        for (int i = 0; i < s.length(); i = i + 2) {
            sb.append(s.charAt(i));
            sb.append((char) (s.charAt(i) + Character.getNumericValue(s.charAt(i + 1))));
        }
//        System.out.println("SB String is "+sb.append(val).toString());
        if (value.length() % 2 == 0) {
            return sb.toString();
        } else {
            return sb.append(val).toString();
        }
    }
}
