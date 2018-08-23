package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Code_202_HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int tmp = n;
            int res = 0;
            while (tmp != 0) {
                int i = tmp % 10;
                res += i * i;
                tmp /= 10;
            }
            if (res == 1) {
                return true;
            } else {
                n = res;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(0));
    }
}
