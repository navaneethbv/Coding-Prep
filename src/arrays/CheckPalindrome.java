package arrays;

public class CheckPalindrome {

    public static void main(String[] args) {
        String value = "noeon";
        if(checkIfPalindrome(value)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }

    static boolean checkIfPalindrome(String value) {
        int left = 0, right = value.length() - 1;
        while ( left < right) {
            if(value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
