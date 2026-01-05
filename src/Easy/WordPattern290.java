package Easy;

import java.util.HashMap;

public class WordPattern290 {

    public static void main(String[] args) {
        System.out.println(
                wordPattern("jquery","jquery" )
        );
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> used = new HashMap<>();
        String[] words = s.split(" ");


        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }

            } else  {
                if (used.containsKey(word)) {
                    return false;
                }
                if (pattern.length() > words.length || pattern.length() < words.length){
                    return false;
                }
                map.put(ch, word);
                used.put(word, ch);
            }
        }
        return true;
    }
}
