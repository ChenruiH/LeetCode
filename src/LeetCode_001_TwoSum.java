import java.util.HashMap;
import java.util.Map;

public class LeetCode_001_TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> valueToIndexMap = new HashMap<>();
            for (int index = 0; index < nums.length; index++ ){
                if (valueToIndexMap.containsKey(target - nums[index])) {
                    return new int[] {valueToIndexMap.get(target - nums[index]), index};
                }
                valueToIndexMap.put(nums[index], index);
            }
            return new int[2];
        }
    }
}
