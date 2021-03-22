package level1;

//https://leetcode.com/problems/two-sum/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //using Map
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int neededNum = target - nums[i];
            if (cache.containsKey(neededNum)) {
                return new int[]{cache.get(neededNum), i};
            } else {
                cache.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
