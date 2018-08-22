package leetcode;

public class Code_172_FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        long m = 5;
        int res = 0;
        long t = n / m;
        while (t != 0) {
            res += t;
            m *= 5;
            t = n / m;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(1808548329));
    }
}
