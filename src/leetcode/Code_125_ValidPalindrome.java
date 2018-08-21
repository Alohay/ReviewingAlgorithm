package leetcode;

public class Code_125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int size = s.length();
        int i = 0;
        int j = size - 1;
        while (i < j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!isValid(ci)) {
                i++;
            } else if (!isValid(cj)) {
                j--;
            } else {
                ci = Character.toLowerCase(ci);
                cj = Character.toLowerCase(cj);
                if (ci != cj) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static boolean isValid(char c) {
        return ('0' <= c && c <= '9') || ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z');
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("1"));
    }
}
