package leetcode.easy;

public class AddStrings {

    public AddStrings() {
    }

    // Time Complexity: O(n) - being n the longer string
    // Space Complexity: O(n)
    public String addStrings(String num1, String num2) {
        char[] num1Chars = num1.toCharArray();
        char[] num2Chars = num2.toCharArray();

        int remaining = 0;
        int indexNum1 = num1Chars.length - 1;
        int indexNum2 = num2Chars.length - 1;

        StringBuilder result = new StringBuilder();

        while (indexNum1 >= 0 || indexNum2 >= 0) {
            int currentNum1 = indexNum1 >= 0 ? num1Chars[indexNum1] - '0' : 0;
            int currentNum2 = indexNum2 >= 0 ? num2Chars[indexNum2] - '0' : 0;

            int resultTemp = currentNum1 + currentNum2 + remaining;
            int rest = resultTemp % 10;
            remaining = resultTemp / 10;

            result.append((char) (rest + '0'));

            indexNum1--;
            indexNum2--;
        }

        if (remaining != 0) {
            result.append((char) (remaining + '0'));
        }

        return result.reverse().toString();
    }
}