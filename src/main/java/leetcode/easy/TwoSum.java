package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] firstExampleOutput = getTwoSumIndexes(new int[]{2, 7, 11, 15}, 9);
        System.out.println("First Example Indexes: " + firstExampleOutput[0] + "," + firstExampleOutput[1]);

        int[] secondExampleOutput = getTwoSumIndexes(new int[]{3, 2, 4}, 6);
        System.out.println("Second Example Indexes: " + secondExampleOutput[0] + "," + secondExampleOutput[1]);

        int[] thirdExampleOutput = getTwoSumIndexes(new int[]{3, 3}, 6);
        System.out.println("Third Example Indexes: " + thirdExampleOutput[0] + "," + thirdExampleOutput[1]);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    private static int[] getTwoSumIndexes(int[] input, int target) {
        int[] indexes = new int[2];

        Map<Integer,Integer> aux = new HashMap<>();
        for(int i=0; i<input.length ; i++)
            aux.put(target - input[i], i);

        for(int j=0; j<input.length ; j++){
            if(aux.containsKey(input[j]) && j!=aux.get(input[j])) {
                indexes[0] = aux.get(input[j]);
                indexes[1] = j;
            }
        }
        return indexes;
    }
}