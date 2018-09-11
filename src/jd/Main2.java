package jd;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[3][n];
        int m0 = 0;
        int m1 = 0;
        int m2 = 0;
        for (int i = 0; i < n; i++) {
            arr[0][i] = in.nextInt();
//            m0 = arr[0][i] > arr[0][m0] ? i : m0;
            arr[1][i] = in.nextInt();
//            m1 = arr[1][i] > arr[1][m1] ? i : m1;
            arr[2][i] = in.nextInt();
//            m2 = arr[2][i] > arr[2][m2] ? i : m2;
        }
//        Arrays.sort(arr[0]);
        sort(arr);
        int maxLine = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
//            if (arr[0][i] < arr[0][maxLine] && arr[1][i] < arr[1][maxLine] && arr[2][i] < arr[2][maxLine]) {
//                res++;
//                continue;
//            }
            for (int j = i + 1; j < n; j++) {
                if (arr[0][i] < arr[0][j] && arr[1][i] < arr[1][j] && arr[2][i] < arr[2][j]) {
                    res++;
                    maxLine = j;
                    break;
                }
            }
        }
//
//        for (int i = 0; i < n; i++) {
//            if ((arr[0][i] < arr[0][m0] && arr[1][i] < arr[1][m0] && arr[2][i] < arr[2][m0])
//                    || (arr[0][i] < arr[0][m1] && arr[1][i] < arr[1][m1] && arr[2][i] < arr[2][m1])
//                    || (arr[0][i] < arr[0][m2] && arr[1][i] < arr[1][m2] && arr[2][i] < arr[2][m2])) {
//                res++;
//            }
//        }
        System.out.println(res);
    }

    public static void sort(int[][] arr) {
        int size = arr[0].length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size && arr[0][j] < arr[0][i]; j++) {
                swap(arr[0], i, j);
                swap(arr[1], i, j);
                swap(arr[2], i, j);
            }
        }
    }

    public static void swap(int[] arr, int p, int q) {
        arr[p] = arr[p] + arr[q];
        arr[q] = arr[p] - arr[q];
        arr[p] = arr[p] - arr[q];
    }
}
