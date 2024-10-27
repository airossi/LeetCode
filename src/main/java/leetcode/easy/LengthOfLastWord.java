package leetcode.easy;

public class LengthOfLastWord {

    public LengthOfLastWord() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        for (; index >= 0; index--) {
            if (s.charAt(index) != ' ')
                break;
        }
        int lengthOfLastWord = 0;
        for (; index >= 0; index--) {
            if (s.charAt(index) != ' ')
                lengthOfLastWord++;
            else break;
        }
        return lengthOfLastWord;
    }
}