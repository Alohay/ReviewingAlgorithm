import java.util.Scanner;

public class Code_02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] apples = new int[n];
        for (int i = 0; i < n; i++) {
            apples[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] ques = new int[m];
        for (int i = 0; i < m; i++) {
            ques[i] = in.nextInt();
        }
        process(apples, ques);
    }

    public static void process(int[] apples, int[] ques) {
        int size = apples.length;
        int[] help = new int[size + 1];

        help[0] = 0;
        for (int i = 0; i < size; i++) {
            help[i + 1] = apples[i] + help[i];
        }

        int m = ques.length;

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < size; j++) {
//                if (help[j] <= ques[i] && ques[i] <= help[j + 1]) {
//                    System.out.println(j + 1);
//                    break;
//                }
//            }
//        }
//
        for (int i = 0; i < m; i++) {
            System.out.println(search(help, 0, help.length - 1, ques[i]));
        }
    }

    public static int search(int[] arr, int l, int r, int q) {

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (q < arr[m]) {
                if (q > arr[m - 1]) {
                    return m;
                }
                r = m - 1;
            } else if (q > arr[m]) {
                if (q <= arr[m + 1]) {
                    return m + 1;
                }
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

}

/**
 * 5
 * 2 7 3 4 9
 * 3
 * 1 25 11
 */
