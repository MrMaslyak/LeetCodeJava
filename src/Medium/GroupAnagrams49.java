package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        System.out.println(
                groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<HashMap<Character, Integer>> seenMaps = new ArrayList<>();

            for (String word : strs) {
                HashMap<Character, Integer> map = new HashMap<>();
                for (char ch : word.toCharArray()) {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }

                boolean added = false;

                for (int i = 0; i < seenMaps.size(); i++) {
                    if (map.equals(seenMaps.get(i))){
                        result.get(i).add(word);
                        added = true;
                        break;
                    }
                }

                if (!added) {
                    List<String> newGroup = new ArrayList<>();
                    newGroup.add(word);
                    result.add(newGroup);
                    seenMaps.add(map);
                }
            }


        return result;
    }
}
