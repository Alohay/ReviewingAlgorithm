package c_1;

import utils.CommonUtils.*;

import static utils.CommonUtils.printArr;
import static utils.CommonUtils.swapWithXOR;

public class Code_00_BubbleSort {

    public static void process(int[] arr) {
        int size = arr.length;
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapWithXOR(arr, j, j + 1);
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1,};

        process(arr);

        printArr(arr);
    }
}
