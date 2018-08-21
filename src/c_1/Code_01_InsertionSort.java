package c_1;

import static utils.CommonUtils.printArr;
import static utils.CommonUtils.swapWithXOR;

public class Code_01_InsertionSort {

    public static void process(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swapWithXOR(arr, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1,};

        process(arr);

        printArr(arr);
    }

}
