package leetcode;

public class Code_70_ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (climbStairs(i) != climb(i)){
                System.out.println("555");
            }
        }
    }
}
