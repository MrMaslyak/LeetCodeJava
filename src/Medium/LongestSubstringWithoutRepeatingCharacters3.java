package Medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        System.out.println(
                lengthOfLongestSubstring("abcabcbb")
        );
    }

//    Я расширяю окно вправо, пока все символы уникальны.
//    Как только появляется повтор — сдвигаю левую границу, пока повтор не исчезнет.
//    На каждом шаге запоминаю максимальную длину окна.

    public static int lengthOfLongestSubstring(String s){
        int  max = 0;
        int right = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()){
            char ch = s.charAt(right);
            if (!set.contains(ch)){
                set.add(s.charAt(right));
                right++;
                max = Math.max(max, set.size());
            }else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstringV2_didntWork(String s){
        int left = 0;
        int length = 0;
        HashSet<Object> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            set.add(s.charAt(right));
            length = set.size();
        }
        return length;
    }

    public static int lengthOfLongestSubstringV3_didntWork(String s){
        int length = 0;
        StringBuilder sb = new StringBuilder();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (sb.indexOf(String.valueOf(ch)) != -1) {
                sb.deleteCharAt(0);
            }
            sb.append(ch);
            length = sb.length();
        }
        return length;
    }
    
}
