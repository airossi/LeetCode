package leetcode.easy;

public class SingleNumber {
    public static void main(String[] args) {
        int firstExampleOutput = singleNumber(new int[]{2, 2, 1});
        System.out.println("First Example Single Number Is: " + firstExampleOutput);

        int secondExampleOutput = singleNumber(new int[]{4, 2, 1, 2, 1});
        System.out.println("Second Example Single Number Is: " + secondExampleOutput);

        int thirdExampleOutput = singleNumber(new int[]{1});
        System.out.println("Third Example Single Number Is: " + thirdExampleOutput);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }
}