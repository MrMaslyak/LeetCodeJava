package Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxDistanceInArray624 {
    public static void main(String[] args) {
        List<List<Integer>> arrays = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(1,2,3)
        );

        int result = maxDistance(arrays);
        System.out.println("Maximum Distance: " + result);
    }

    public static int maxDistance(List<List<Integer>> arrays) {

        int result = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            int currentMin = array.get(0);
            int currentMax = array.get(array.size() - 1);

            result = Math.max(result, currentMax - min);
            result = Math.max(result, max - currentMin);

            min = Math.min(min, currentMin);
            max = Math.max(max, currentMax);


        }

        return result;
    }
}
