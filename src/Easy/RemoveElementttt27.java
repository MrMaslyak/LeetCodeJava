package Easy;

public class RemoveElementttt27 {

    public static void main(String[] args) {
        System.out.println(
                removeElement(new int[]{3, 2, 2, 3}, 3)
        );
    }


    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
