package Easy;

public class LemonadeChange860 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(lemonadeChange(new int[]{5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int i:bills){
            if(i==5){
                five++;
            }
            if (i==10) {
                if(five==0){
                    return false;
                }
                five--;
                ten++;
            }
            if (i == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
