package Hard;

import java.util.HashMap;

public class MinimumWindowSubstring76 {

    public static void main(String[] args) {
        System.out.println(
                minWindow("ADOBECODEBANC", "ABC")
        );
    }

    public static String minWindow(String s, String t) {
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;
        int minRight = 0;
        int right = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            right++;
            if (right < minLength){
                minLength = s.length();
                minLeft = left;
                minRight = right;
                map.remove(s.charAt(left));
                left++;
            }
        }

        return s.substring(minLeft, minRight);
    }
}
