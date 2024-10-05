package leetcode.easy;

public class RemoveElement {

    public RemoveElement() {}

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int removeElement(int[] nums, int val) {
        int firstIndex = 0;
        for (int secondIndex = 0; secondIndex < nums.length; secondIndex++) {
            if (nums[secondIndex] != val) {
                nums[firstIndex] = nums[secondIndex];
                firstIndex++;
            }
        }
        return firstIndex;
    }
}