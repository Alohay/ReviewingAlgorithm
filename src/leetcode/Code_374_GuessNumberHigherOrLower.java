package leetcode;

public class Code_374_GuessNumberHigherOrLower {
    // provided api
    static int guess(int num) {
        if (num == 6) return 0;
        return num > 6 ? -1 : 1;
    }

    public static int process(int l, int r) {
        int m = l + (r - l) / 2;
        int d = guess(m);
        if (d > 0) {
            return process(m + 1, r);
        } else if (d < 0) {
            return process(l, m - 1);
        } else {
            return m;
        }
    }

    public static int guessNumber(int n) {
        return process(1, n);
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
