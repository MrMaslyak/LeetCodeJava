package Medium;

import java.util.HashSet;

public class LongestSbtWithoutReapChara3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet <String> set = new HashSet();
        int max = 0;
        for ( int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (set.contains(String.valueOf(s.charAt(j)))) {
                    break;
                }
                set.add(String.valueOf(s.charAt(j)));
            }
            if (set.size() > max) {
                max = set.size();
            }
            set.clear();
        }
        return max;
    }
}
