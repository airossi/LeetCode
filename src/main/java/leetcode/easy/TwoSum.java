package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public TwoSum() {}

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] getTwoSumIndexes(int[] nums, int target) {
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