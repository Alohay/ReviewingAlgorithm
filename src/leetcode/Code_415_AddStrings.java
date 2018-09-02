package leetcode;

public class Code_415_AddStrings {
    public static String addStrings(String num1, String num2) {
        int s1 = num1.length() - 1;
        int s2 = num2.length() - 1;
        int cc = 0;
        StringBuilder sb = new StringBuilder();
        while (s1 >= 0 && s2 >= 0) {
            int tmp = num1.charAt(s1) - '0' + num2.charAt(s2) - '0' + cc;
            cc = tmp / 10;
            tmp = tmp % 10;
            sb.append(tmp);
            s1--;
            s2--;
        }
        while (s1 >= 0) {
            int tmp = (int) num1.charAt(s1) - '0' + cc;
            cc = tmp / 10;
            tmp = tmp % 10;
            sb.append(tmp);
            s1--;
        }
        while (s2 >= 0) {
            int tmp = (int) num2.charAt(s2) - '0' + cc;
            cc = tmp / 10;
            tmp = tmp % 10;
            sb.append(tmp);
            s2--;
        }
        if (cc != 0) sb.append(cc);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
//        System.out.println(addStrings("1", "9"));
    }
}
