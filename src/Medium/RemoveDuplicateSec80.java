package Medium;

public class RemoveDuplicateSec80 {
    public static void main(String[] args) {
        System.out.println(
                removeDuplicates(
                        new int[]{1,1,1,2,2,3}
                )
        );
    }

    public static int removeDuplicates(int[] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
