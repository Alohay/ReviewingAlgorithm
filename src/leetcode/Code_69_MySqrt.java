package leetcode;

public class Code_69_MySqrt {

    public static int mySqrt(int x) {
        int l = 0;
        int r = x;
        while (l < r) {
            int m = l + (r - l) / 2;
            int tmp = m * m;
            if (tmp < 0 || (m > 0 && tmp / m < m) || tmp > x) {
                r = m - 1;
            } else if (tmp < x) {
                l = m + 1;
            } else {
                return m;
            }
            if (l * l > x) {
                return m;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(mySqrt(i));

        }
            System.out.println(mySqrt(Integer.MAX_VALUE));
    }
}
