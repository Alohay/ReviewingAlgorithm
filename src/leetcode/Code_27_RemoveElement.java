package leetcode;

public class Code_27_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int size = nums.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5,6,6,7,8,9,};
        int len = removeElement(arr,10);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
