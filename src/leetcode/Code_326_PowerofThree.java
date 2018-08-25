package leetcode;

public class Code_326_PowerofThree {
    public static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while (n > 1) {
            if (n % 3 != 0) return false;
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(Integer.MAX_VALUE));
    }
}
