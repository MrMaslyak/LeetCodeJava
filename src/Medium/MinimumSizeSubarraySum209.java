package Medium;

public class MinimumSizeSubarraySum209 {

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        System.out.println(
                minSubArrayLen(7, nums)
        );
    }

//    Я беру окно, которое сначала начинается с нулевого индекса.
//    Считаю сумму элементов в этом окне.
//    Если сумма меньше target — я расширяю окно вправо.
//    Если сумма стала больше или равна target — я пытаюсь уменьшить окно слева, чтобы найти минимальный размер.

    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int length = 0;
        int minLength = Integer.MAX_VALUE;
        while (right < nums.length) {
            if (sum < target){
                sum += nums[right];
                right++;
            } while (sum >= target){
                length = right - left;
                if (length < minLength) {
                    minLength = length;
                }
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
