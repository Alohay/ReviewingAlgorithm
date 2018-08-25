package leetcode;

public class Code_278_FirstBadVersion {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (isBadVersion(m)) {
                if (!isBadVersion(m - 1)) return m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public boolean isBadVersion(int version) {
        return true;
    }
}
