package leetcode;

public class Code_441_ArrangingCoins {
    public static int arrangeCoins(int n) {
        if (n == 1 || n == 2) return 1;
        int c = n;
        for (int i = 1; i <= n; i++) {
            if (c >= i) {
                c -= i;
            } else {
                return i - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(100));
    }
}
