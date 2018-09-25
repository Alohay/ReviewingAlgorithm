package baicizhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<int[]> list = new ArrayList<>();
        int size = 0;
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            size += m;
            int[] arr = new int[m];
            for (int k = 0; k < m; k++) {
                arr[k] = in.nextInt();
            }
            list.add(arr);
        }
        process(list, size);
    }

    public static void process(List<int[]> list, int size) {
        int[] arr = new int[size];
        int len = list.size();
        int[] idxs = new int[len];
        int m = 0;
        for (int i = 0; i < size; i++) {
            int min = Integer.MAX_VALUE;
            for (int k = 0; k < len; k++) {
                if (idxs[k] == list.get(k).length) {
                    continue;
                }
                min = Math.min(list.get(k)[idxs[k]], min);
            }
            for (int i1 = 0; i1 < len; i1++) {
                int kk = idxs[i1];
                int[] tmp = list.get(i1);
                int ss = tmp.length;
                while (kk < ss && tmp[kk] <= min) {
                    arr[m++] = tmp[kk++];
                }
                idxs[i1] = kk;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
