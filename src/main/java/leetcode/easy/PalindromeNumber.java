package leetcode.easy;

public class PalindromeNumber {

    public PalindromeNumber() {
    }

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        long original = x;
        long reversed = 0;
        while (x > 0) {
            int remaining = x % 10;
            x /= 10;
            reversed += remaining;
            reversed *= 10;
        }
        reversed /= 10;

        return original == reversed;
    }
}