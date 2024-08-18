package Medium;

import java.util.ArrayList;

public class Uglynumber264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1352));
    }

    public static int nthUglyNumber(int n) {
        ArrayList<Integer> listUglyNum = new ArrayList<>();
        listUglyNum.add(1);

        int i2 = 0, i3 = 0, i5 = 0;
        int nextMultipleOf2 = 2;
        int nextMultipleOf3 = 3;
        int nextMultipleOf5 = 5;
        int nextUglyNum = 1;

        for (int i = 1; i < n; i++) {
            nextUglyNum = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));
            listUglyNum.add(nextUglyNum);

            if (nextUglyNum == nextMultipleOf2) {
                i2++;
                nextMultipleOf2 = listUglyNum.get(i2) * 2;
            }
            if (nextUglyNum == nextMultipleOf3) {
                i3++;
                nextMultipleOf3 = listUglyNum.get(i3) * 3;
            }
            if (nextUglyNum == nextMultipleOf5) {
                i5++;
                nextMultipleOf5 = listUglyNum.get(i5) * 5;
            }
        }
        return listUglyNum.get(n - 1);
    }
}
