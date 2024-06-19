package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

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
    private static int[] getTwoSumIndexes(int[] nums, int target) {
        int[] indexes = new int[2];

        Map<Integer,Integer> aux = new HashMap<>();
        for(int i=0; i<nums.length ; i++)
            aux.put(target - nums[i], i);

        for(int j=0; j<nums.length ; j++){
            if(aux.containsKey(nums[j]) && j!=aux.get(nums[j])) {
                indexes[0] = aux.get(nums[j]);
                indexes[1] = j;
            }
        }
        return indexes;
    }
}