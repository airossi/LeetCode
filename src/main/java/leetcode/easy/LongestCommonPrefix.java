package leetcode.easy;

public class LongestCommonPrefix {

    public LongestCommonPrefix() {}

    // Time Complexity: O(nm) - Being n number of strings and m the length of the string
    // Space Complexity: O(1)
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        String tempCommonPrefix = getCommonPrefix(strs[0], strs[1]);
        int stringIndex = 2;
        while(stringIndex < strs.length) {
            tempCommonPrefix = getCommonPrefix(tempCommonPrefix, strs[stringIndex]);
            if(tempCommonPrefix.isEmpty()) break;
            stringIndex++;
        }
        return tempCommonPrefix;

    }

    private String getCommonPrefix(String first, String second) {
        int i = 0;
        StringBuilder partialPrefix = new StringBuilder();
        while(i < first.length() && i < second.length()) {
            if(first.charAt(i) == second.charAt(i))
                partialPrefix.append(first.charAt(i));
            else
                break;
            i++;
        }
        return partialPrefix.toString();
    }
}