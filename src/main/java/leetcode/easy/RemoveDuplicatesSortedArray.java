package leetcode.easy;

public class RemoveDuplicatesSortedArray {

    public RemoveDuplicatesSortedArray() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int removeDuplicates(int[] nums) {
        int left = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}