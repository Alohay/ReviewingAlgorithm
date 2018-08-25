package leetcode;

public class Code_292_NimGame {
    public boolean canWinNim(int n) {
        return ((n - 1) % 4 == 0) || ((n - 2) % 4 == 0) || ((n - 3) % 4 == 0);
    }
}
