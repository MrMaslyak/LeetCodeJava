package Easy;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        int countC = 0;
        int countS = 0;
        int countR = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
                s = s.replace("()", "");
                s = s.replace("[]", "");
                s = s.replace("{}", "");
            }
            if (chars[i] == '(') countC++;
            if (chars[i] == '[') countS++;
            if (chars[i] == '{') countR++;
            if (chars[i] == ')') countC--;
            if (chars[i] == ']') countS--;
            if (chars[i] == '}') countR--;
            if (countC < 0 || countS < 0 || countR < 0) return false;
        }

        return s.isEmpty();
    }
}
