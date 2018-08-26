package leetcode;

public class Code_367_ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 0 || num > 2147395600) return false;
        if (num <= 1) return true;
        int l = 2;
        int r = num;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int s = num / m;
            if (num % m == 0 & s == m) {
                return true;
            } else if (s < m) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }


}
