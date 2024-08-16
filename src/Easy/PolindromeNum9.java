package Easy;

public class PolindromeNum9 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public boolean isPalindrome(int x) {
        int lastDigit=0;
        int Ans=0;
        int n=x;

        while(n>0){
            lastDigit=n%10;
            Ans=Ans*10+lastDigit;
            n=n/10;
        }
        if(x==Ans){
            return true;
        }
        return false;
    }
}
