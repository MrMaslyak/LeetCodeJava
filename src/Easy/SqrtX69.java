package Easy;

public class SqrtX69 {

    public static void main(String[] args) {
        System.out.println(mySqrtWithOperExponentFunc(8));
        System.out.println(mySqrt(2147483647));
    }

    public static int mySqrtWithOperExponentFunc (int x) {
        Math.sqrt(x);
        return (int) Math.sqrt(x);
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1, right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

}
