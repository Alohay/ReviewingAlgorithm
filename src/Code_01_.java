import java.util.Scanner;

/**
 * 6 3
 * 1 3 5 2 5 4
 * 1 1 0 1 0 0
 */

public class Code_01_ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] interests = new int[n];
        int[] status = new int[n];

        for (int i = 0; i < n; i++) {
            interests[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            status[i] = in.nextInt();
        }
        System.out.println(process(interests, status, k, 0, n - 1));
    }

    public static int process(int[] interests, int[] status, int k, int l, int r) {
        if (interests == null || status == null || k == 0 || l > r) {
            return 0;
        }
        int sum = 0;
//        int n = status.length;
        int i = l;

        for (; i <= r && status[i] == 1; i++) {
            sum += interests[i];
        }

        sum += Math.max(
                process(interests, status, k, i + 1, r),
//                        process(interests, copyArr(status, i, k), k, i, r)

                (r - i + 1 >= k)
                        ? process(interests, copyArr(status, i, k), k, i, r)
                        : Integer.MIN_VALUE
        );

        return sum;
    }

    public static int[] copyArr(int[] src, int pos, int k) {
        int size = src.length;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (pos <= i) && (i < pos + k) ? 1 : src[i];
        }
        return arr;
    }
}