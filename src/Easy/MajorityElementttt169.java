package Easy;

import java.util.HashMap;

public class MajorityElementttt169 {
    public static void main(String[] args) {
        System.out.println(
                majorityElement(new int[]{3,3, 4})
        );

    }

    public static int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int limit  = nums.length /2 ;
        int maj = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > limit) {
                maj = num;
            }
        }
        return maj;
    }

}
