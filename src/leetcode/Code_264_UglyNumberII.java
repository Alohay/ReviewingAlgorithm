package leetcode;

public class Code_264_UglyNumberII {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = Math.min(Math.min(arr[index2] * 2, arr[index3] * 3), arr[index5] * 5);
            if (arr[i] == arr[index2] * 2) index2++;
            if (arr[i] == arr[index3] * 3) index3++;
            if (arr[i] == arr[index5] * 5) index5++;
        }
        return arr[n - 1];
    }

}
