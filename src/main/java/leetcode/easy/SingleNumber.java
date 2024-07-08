package leetcode.easy;

public class SingleNumber {

    public SingleNumber() {}

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int singleNumber(int[] nums) {
        int result=0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}