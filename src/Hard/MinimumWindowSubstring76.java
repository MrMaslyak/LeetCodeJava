package Hard;

import java.util.HashMap;

public class MinimumWindowSubstring76 {

    public static void main(String[] args) {
        System.out.println(
                minWindow("ab", "b")
        );
    }

    public static String minWindow(String s, String t) {

        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;
        int left = 0, right = 0;
        int formed = 0;

        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> valid = new HashMap<>();


        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            valid.put(ch, valid.getOrDefault(ch, 0) + 1);
        }

        while (right < s.length()) {
            char ch = s.charAt(right);
            if (valid.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                if (window.get(ch).intValue() == valid.get(ch).intValue()) {
                    formed++;
                }
            }
            right++;


            while (formed == valid.size()) {
                char leftChar = s.charAt(left);

                if (valid.containsKey(leftChar)) {
                    window.put(leftChar, window.get(leftChar) - 1);
                    if (window.get(leftChar) < valid.get(leftChar)) {
                        formed--;
                    }
                    if (right - left < minLength) {
                        minLength = right - left;
                        minLeft = left;
                    }
                }
                left++;
            }
        }


        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }
}
