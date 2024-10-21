package leetcode.easy;

public class IsomorphicString {

    public IsomorphicString() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isIsomorphic(String s, String t) {
        int[] firstString = new int[256];
        int[] secondString = new int[256];

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (firstString[s.charAt(i)] != secondString[t.charAt(i)])
                return false;
            firstString[s.charAt(i)] = i + 1;
            secondString[t.charAt(i)] = i + 1;
        }
        return true;
    }
}