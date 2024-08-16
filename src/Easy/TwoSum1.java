package Easy;

import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = target - nums[i];
            if (map.containsKey(current)){
                return new int[] {map.get(current), i};
            }
            map.put(nums[i], i);

        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
