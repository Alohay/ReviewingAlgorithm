package leetcode;

public class Code_263_UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        int i = num % 2; // ?????????? 无语
        while (i == 0) {
            num /= 2;
            i = num % 2;
        }
        i = num % 3;
        while (i == 0) {
            num /= 3;
            i = num % 3;
        }
        i = num % 5;
        while (i == 0) {
            num /= 5;
            i = num % 5;
        }
        return num == 1;
    }
}
