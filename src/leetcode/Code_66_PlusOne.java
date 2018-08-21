package leetcode;

public class Code_66_PlusOne {
    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        int[] res = new int[size];
        System.arraycopy(digits, 0, res, 0, size);
        process(res, 0, size - 1);
        if (res[0] == 0) {
            res = new int[size + 1];
            res[0] = 1;
        }
        return res;
    }

    public static void process(int[] arr, int l, int r) {
        if (l > r) {
            return;
        }
        if (arr[r] == 9) {
            arr[r] = 0;
            process(arr, l, r - 1);
        } else {
            arr[r] = arr[r] + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,};
        int[] res = plusOne(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
}
