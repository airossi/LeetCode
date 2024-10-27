package leetcode.easy;

public class MissingNumber {

    public MissingNumber() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int missingNumber(int[] nums) {
        boolean[] existingNumbers = new boolean[nums.length + 1];
        for (int currentNum : nums) {
            existingNumbers[currentNum] = true;
        }
        for (int index = 1; index < existingNumbers.length; index++) {
            if (!existingNumbers[index])
                return index;
        }
        return 0;
    }
}