package Easy;

import java.util.HashMap;


public class ContainsDublicateSec219 {
    public static void main(String[] args) {
        System.out.println(
                containsNearbyDuplicate(
                        new int[]{1, 2, 3, 1}, 3
                )
        );
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
          if (map.containsKey(num)){
              int index = map.get(num);
              if (i - index <= k) {
                  return true;
              }
          }
            map.put(nums[i], i);
        }

        return false;
    }
}
