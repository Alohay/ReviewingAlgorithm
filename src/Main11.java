import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(process(arr, n));
    }

    public static int process(int[] arr, int n) {
        if (n == 1) return arr[0];
        int res = Integer.MAX_VALUE;
        int[] help = new int[n];
        help[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            help[i] = Math.min(help[i + 1] + arr[i], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            res = Math.min(help[i], res);
        }
        return res;
    }
}
