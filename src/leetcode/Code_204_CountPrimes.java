package leetcode;

public class Code_204_CountPrimes {
    public int countPrimes(int n) {
        if (n < 2) return 0;
        boolean[] arr = new boolean[n];
        for (int i = 2; i < n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            for (int j = i * i; j < n; j += i) {
                arr[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            count = arr[i] ? count + 1 : count;
        }
        return count;
    }
}
