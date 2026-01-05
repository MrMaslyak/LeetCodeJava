package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))
        );
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            int j = target - nums[i];
            if (set.containsKey(j)){
                int pos = set.get(j);
                int[] newArray = {pos, i};
                return newArray;
            }else {
                set.put(k, i);
            }
        }
        int [] newArray = {0, 0};

        return newArray;
    }
}
