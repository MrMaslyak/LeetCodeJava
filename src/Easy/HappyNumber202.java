package Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();
        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
