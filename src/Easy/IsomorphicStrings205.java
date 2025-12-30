package Easy;

import java.util.HashMap;

public class IsomorphicStrings205 {

    public static void main(String[] args) {
        System.out.println(
                isIsomorphic("egg", "add")
        );
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> used = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (map.containsKey(chS)) {
                if (map.get(chS) != chT) {
                    return false;
                }
            } else {
                if (used.containsKey(chT)) {
                    return false;
                }
                map.put(chS, chT);
                used.put(chT, chS);
            }
        }

        return true;
    }
}
