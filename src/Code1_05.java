import java.util.Scanner;


/**
 * 5 100
 * 0 4 4 5 57 60 40 50 99 100
 */
public class Code1_05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] times = new int[n][2];

        for (int i = 0; i < n; i++) {
            times[i][0] = in.nextInt();
            times[i][1] = in.nextInt();
        }
        sort(times);
        System.out.println(process(times, 0, n - 1, m));
    }

    public static int process(int[][] times, int l, int r, int m) {
        int sum = 1;
//        if (l > r || (times[l][0] > times[l][1] && times[l][1] > 0) || times[r][0] >= m || times[r][1] > m) {
        if (l > r || times[r][0] >= m || times[r][1] > m) {
            return 0;
        }
//        if (times[l][1] == 0) {
        if (times[l][0] > times[l][1]) {
            return sum;
        }

        return sum + Math.max(
                process(times, select(times, times[l][1], m, true), r, m),
                process(times, select(times, times[l][1], m, false), r, m)
        );
    }

    public static void sort(int[][] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && arr[j][0] < arr[j - 1][0]; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    public static void swap(int[][] arr, int p, int q) {
        int[] tmp = arr[p];
        arr[p] = arr[q];
        arr[q] = tmp;
    }


    public static int select(int[][] times, int cur, int m, boolean leave) {
        int size = times.length;
        int i = 0;
        while (i < size && times[i][0] < cur) {
            i++;
        }
        int next = i;
        if (leave) {
            next += 1;
        }
        if (next < size) {
            return times[next][0] > m ? size : next;
        }
        // ?
        return size;
    }
}
