package Easy;

public class IsSubsequence392 {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int startS = 0;
        for (int i = 0; i < t.length(); i++) {
            if (startS < s.length() && s.charAt(startS) == t.charAt(i)) {
                startS++;
            }
        }
        return startS == s.length();
    }
}
