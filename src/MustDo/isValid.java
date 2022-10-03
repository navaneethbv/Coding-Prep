package MustDo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class isValid {
    public static boolean isValid(String s) {
        if(s.length() == 0 || s.length() == 1) return false;
        if(s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')') return false;
        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.size() != 0 && stack.peek() == '(' && s.charAt(i) == ')' ||
                   stack.size() != 0 && stack.peek() == '{' && s.charAt(i) == '}' ||
                   stack.size() != 0 && stack.peek() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String validParentheses = "{()}[)";
        if(isValid(validParentheses)) {
            System.out.println("The given parentheses is valid");
        } else {
            System.out.println("The given parentheses is not valid");
        }
    }
}
