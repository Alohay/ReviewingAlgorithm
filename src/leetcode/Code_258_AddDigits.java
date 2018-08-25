package leetcode;

public class Code_258_AddDigits {
    public int addDigits(int num) {
        if (num < 10) return num;
        int res = 0;
        while (num > 0) {
            res += num % 10;
            num /= 10;
        }
        return addDigits(res);
    }
}