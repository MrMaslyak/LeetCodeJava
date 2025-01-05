package Easy;

public class singleNumber136 {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int singleNum = 0;
        for (int i = 0; i < nums.length; i++) {
            singleNum ^= nums[i];
        }
        return singleNum;
    }
}
