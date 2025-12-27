package Hard;

import java.util.HashMap;

public class MinimumWindowSubstring76 {

    public static void main(String[] args) {
        System.out.println(
                minWindow("ADOBECODEBANC", "ABC")
        );
    }

    public static String minWindow(String s, String t) {
        int right = 0;
        int counter = 0;
        int left = 0;
        String result = "";
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()){
            char ch = s.charAt(right);
            map.put(ch, counter);
            right++;
            result = map.toString();
        }
        return result;
    }
}
