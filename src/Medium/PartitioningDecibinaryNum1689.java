package Medium;

public class PartitioningDecibinaryNum1689 {
    public static void main(String[] args) {

    }

    public static int minPartitions(String n) {
     int len  = n.length();
     char max = '0';
        int correctSym = 0;
        for (int i = 0; i < len; i++) {
            char symbol = n.charAt(i);
            if (symbol > max) {
                max = symbol;
                correctSym = Integer.parseInt(String.valueOf(max));
            }
        }
        return correctSym;
    }
}
