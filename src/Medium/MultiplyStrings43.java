package Medium;

public class MultiplyStrings43 {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
    public static String multiply(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length()];
        char ch1, ch2;
        int temp = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            ch1 = num1.charAt(i);
            for (int j = num2.length() - 1; j >= 0; j--) {
                ch2 = num2.charAt(j);
                int mul = (ch1 - '0') * (ch2 - '0');
                int sum = mul + result[i + j + 1] + temp;
                temp = sum / 10;
                result[i + j + 1] = sum % 10;
                if (temp > 0) {
                    result[i + j] += temp;
                    temp = 0;
                }

            }
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0 && flag) {
                continue;
            }
            flag = false;
            sb.append(result[i]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
