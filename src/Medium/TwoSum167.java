package Medium;

import java.util.Arrays;

public class TwoSum167 {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))
        );
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1 ;
        int[] answer = new int[1];
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if (sum < target){
                left++;
            }else {
                right--;
            }
            if (sum == target){
                return answer;
            }
        }
    }
}
