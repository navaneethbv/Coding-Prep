package MustDo;

public class RomanToInteger {
    private static int getValue(char ch) {
        switch (ch) {
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
        }
        throw new IllegalArgumentException("unsupported character");
    }

    public static int romanToInteger(String s) {
        int sum = 0;
        if(s.length() == 0) return sum;
        for(int i = 0; i < s.length() - 1; i++) {
            int current = getValue(s.charAt(i));
            int next = getValue(s.charAt(i + 1));
            if(current < next) {
                sum = sum - current;
            } else {
                sum = sum + current;
            }
        }
        return sum + getValue(s.charAt(s.length() - 1));
    }

    public static void main(String[] args) {
        String romanNumerals = "MCMXCIV";
        System.out.println("The Roman numeral "+romanNumerals + " converted to Integer is "+romanToInteger(romanNumerals));
    }
}
