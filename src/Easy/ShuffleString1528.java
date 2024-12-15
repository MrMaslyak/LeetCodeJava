package Easy;

public class ShuffleString1528 {
    public static void main(String[] args) {
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String s = "codeleet";
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);
    }
}
