package Easy;

import java.util.HashMap;

public class RansomeNote383 {
    public static void main(String[] args) {
        System.out.println(
                canConstruct("a", "b")
        );
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        HashMap<Character, Integer> ransomMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            ransomMap.put(ch, ransomMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomMap.keySet()) {
            if (!magazineMap.containsKey(ch) ||
                    magazineMap.get(ch) < ransomMap.get(ch)) {
                return false;
            }
        }

        return true;
    }
}
