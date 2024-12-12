package Easy;

import java.util.ArrayList;

public class ContainsDuplicate217 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public  static  boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                return true;
            }
            list.add(nums[i]);
        }
        return false;
    }
}
