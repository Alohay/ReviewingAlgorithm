import java.util.Scanner;


public class Code_01 {

    public static void main(String[] args) {
        int n, k, result;
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String s1[] = s.split(" ");
        n = Integer.parseInt(s1[0]);
        k = Integer.parseInt(s1[1]);
        int a[] = new int[n];
        s = input.nextLine();
        String s2[] = s.split(" ");
        for (int i = 0; i < s2.length; i++) {
            a[i] = Integer.parseInt(s2[i]);
        }

        int t[] = new int[n];
        s = input.nextLine();
        String s3[] = s.split(" ");
        for (int i = 0; i < s3.length; i++) {
            t[i] = Integer.parseInt(s3[i]);
        }

        if (k > n) {
            int result1 = 0;
            for (int i = 0; i < a.length; i++) {
                result1 += a[i];
            }
            result = result1;
        } else {
            int win = 0, wincurrent = 0, count = 0;
            for (int i = 0; i < n; i++) {
                if (t[i] == 0)
                    count++;
            }
            int b[][] = new int[count][2];
            int count1 = 0;
            for (int i = 0; i < n; i++) {

                if (t[i] == 0) {
                    b[count1][0] = a[i];
                    b[count1][1] = i;
                    count1++;
                }
            }
            for (int i = 0; i < count; i++) {
                if (wincurrent > win)
                    win = wincurrent;
                wincurrent = 0;
                if (b[i][1] + k < n) {
                    for (int j = b[i][1]; j < k + b[i][1]; j++) {
                        if (t[j] == 0)
                            wincurrent += a[j];
                    }
                }
                if (b[i][1] + k >= n) {
                    for (int j = b[i][1]; j < n; j++) {
                        if (t[j] == 0)
                            wincurrent += a[j];
                    }
                    if (wincurrent > win)
                        win = wincurrent;
                    break;
                }
            }
            result = win;
        }
        int result2 = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                result2 += a[i];
            }
        }
        result += result2;
        System.out.println(result);
    }


//    public static int process(int[] a, int[] t, int n, int k) {
// int result = 0;
//        if (k > n) {
//            int result1 = 0;
//            for (int i = 0; i < a.length; i++) {
//                result1 += a[i];
//            }
//            result = result1;
//        } else {
//            int win = 0, wincurrent = 0, count = 0;
//            for (int i = 0; i < n; i++) {
//                if (t[i] == 0)
//                    count++;
//            }
//            int b[][] = new int[count][2];
//            int count1 = 0;
//            for (int i = 0; i < n; i++) {
//
//                if (t[i] == 0) {
//                    b[count1][0] = a[i];
//                    b[count1][1] = i;
//                    count1++;
//                }
//            }
//            for (int i = 0; i < count; i++) {
//                if (wincurrent > win)
//                    win = wincurrent;
//                wincurrent = 0;
//                if (b[i][1] + k < n) {
//                    for (int j = b[i][1]; j < k + b[i][1]; j++) {
//                        if (t[j] == 0)
//                            wincurrent += a[j];
//                    }
//                }
//                if (b[i][1] + k >= n) {
//                    for (int j = b[i][1]; j < n; j++) {
//                        if (t[j] == 0)
//                            wincurrent += a[j];
//                    }
//                    if (wincurrent > win)
//                        win = wincurrent;
//                    break;
//                }
//            }
//            result = win;
//        }
//        int result2 = 0;
//        for (int i = 0; i < n; i++) {
//            if (t[i] == 1) {
//                result2 += a[i];
//            }
//        }
//        result += result2;
////        System.out.println(result);
//        return (result);
//
//    }

}
