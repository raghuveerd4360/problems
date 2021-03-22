package level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void testTwoSumUsingMap() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        Assertions.assertEquals(result[0], 0);
        Assertions.assertEquals(result[1], 1);


        int[] nums2 = {3,2,4};
        int target2 = 6;

        int[] result2 = twoSum.twoSum(nums2, target2);
        Assertions.assertEquals(result2[0], 1);
        Assertions.assertEquals(result2[1], 2);
    }
}