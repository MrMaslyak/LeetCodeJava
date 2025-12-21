package Medium;

public class ContainerWithMostWater11 {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(
                maxArea(height)
        );
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int last = height.length - 1;
        int h, w, s;
        int maxS = 0;
        while (start < last){
            h = Math.min(height[start], height[last]);
            w = last - start;
            s = h * w;
            maxS = Math.max(maxS, s);
            if (height[start] < height[last]){
                start++;
            }else {
                last--;
            }
        }
        return maxS;
    }
}
