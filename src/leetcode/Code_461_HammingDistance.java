package leetcode;

public class Code_461_HammingDistance {
    public int hammingDistance(int x, int y) {
        int c = x ^ y;
        int m = 0;
        while (c > 0) {
            if ((c & 1) == 1) m++;
            c >>= 1;
        }
        return m;
    }
}
