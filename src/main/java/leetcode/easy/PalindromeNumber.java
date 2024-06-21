package leetcode.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("First Example is Palindrome Number: " + isPalindrome(121));

        System.out.println("Second Example is Palindrome Number: " + isPalindrome(-121));

        System.out.println("Third Example is Palindrome Number: " + isPalindrome(1000000001));
    }

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    private static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        long original = x;
        long reversed = 0;
        while(x>0) {
            int remaining = x % 10;
            x /= 10;
            reversed += remaining;
            reversed *= 10;
        }
        reversed /= 10;

        return original == reversed;
    }
}