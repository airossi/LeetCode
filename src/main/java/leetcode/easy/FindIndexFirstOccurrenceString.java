package leetcode.easy;

public class FindIndexFirstOccurrenceString {

    public FindIndexFirstOccurrenceString() {
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();

        for (int i = 0; i < haystackChars.length; i++) {
            if (haystackChars[i] == needleChars[0]) {
                if (foundMatch(haystackChars, needleChars, i))
                    return i;
            }
        }
        return -1;
    }

    private boolean foundMatch(char[] haystackChars,
                               char[] needleChars, int originIndex) {
        int i = 0;
        while (i < needleChars.length && originIndex < haystackChars.length) {
            if (needleChars[i] != haystackChars[originIndex])
                return false;
            i++;
            originIndex++;
        }
        if (i >= needleChars.length)
            return true;
        return false;
    }
}