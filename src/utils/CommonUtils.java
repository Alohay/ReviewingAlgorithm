package utils;

public class CommonUtils {

    public static void swapWithXOR(int[] arr, int p, int q) {
        arr[p] = arr[p] ^ arr[q];
        arr[q] = arr[p] ^ arr[q];
        arr[p] = arr[p] ^ arr[q];
    }

    public static void printArr(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
