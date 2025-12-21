package Easy;

public class ValidPalindrome125 {

    public  static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }


    public static boolean isPalindrome(String s) {
        if (s.isBlank()){
            return true;
        }
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                build.append(ch);
            }
        }
        String palindrome = build.toString().toLowerCase();
        int start = 0;
        int last = palindrome.length() - 1 ;
        while (start < last){
            if (palindrome.charAt(start) != palindrome.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }

}


