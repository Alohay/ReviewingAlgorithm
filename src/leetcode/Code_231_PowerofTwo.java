package leetcode;

public class Code_231_PowerofTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        int i = 1;
        while (i > 0 && i < n) {
            i <<= 1;
        }
        return i == n;
    }
}
