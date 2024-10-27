package leetcode.easy;

import java.util.Stack;

public class ValidParentheses {

    public ValidParentheses() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean isValid(String s) {
        if (s.isEmpty() || s.length() == 1)
            return false;
        Stack<Character> currentSymbols = new Stack<>();
        int index = 0;
        while (index < s.length()) {
            char currentChar = s.charAt(index);
            if (currentChar == '{' || currentChar == '[' || currentChar == '(') {
                currentSymbols.push(currentChar);
            } else {
                if (currentSymbols.isEmpty())
                    return false;
                char topChar = currentSymbols.peek();
                if ((currentChar == ']' && topChar == '[') ||
                        (currentChar == '}' && topChar == '{') ||
                        (currentChar == ')' && topChar == '(')) {
                    currentSymbols.pop();
                } else {
                    return false;
                }
            }
            index++;
        }

        return currentSymbols.isEmpty();
    }
}