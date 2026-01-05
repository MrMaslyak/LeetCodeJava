package Easy;

import java.util.HashMap;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(
                isAnagram("anagram", "nagaram")
        );
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()){
            return false;
        }
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}
