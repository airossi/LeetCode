package leetcode.easy;

public class PlusOne {

    public PlusOne() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int[] plusOne(int[] digits) {
        int toAdd = 1;
        for (int index = digits.length - 1; index >= 0; index--) {
            int currentDigit = digits[index];
            if (currentDigit == 9) {
                if (toAdd == 1) currentDigit = 0;
            } else {
                if (toAdd == 1) {
                    currentDigit++;
                    toAdd = 0;
                }
            }
            digits[index] = currentDigit;
        }

        if (toAdd == 1) {
            int[] expandedArray = new int[digits.length + 1];
            expandedArray[0] = 1;
            int indexExpandedArray = 1;
            for (int digit : digits) {
                expandedArray[indexExpandedArray] = digit;
                indexExpandedArray++;
            }
            return expandedArray;
        }
        return digits;
    }
}