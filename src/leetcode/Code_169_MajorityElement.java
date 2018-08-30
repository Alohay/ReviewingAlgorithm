package leetcode;

public class Code_169_MajorityElement {


    public int majorityElement(int[] nums) {
        return find(nums, 0, nums.length - 1);
    }

    public int find(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int m = l + (r - l) / 2;
        int ll = find(arr, l, m);
        int rr = find(arr, m + 1, r);
        if (ll == rr) {
            return ll;
        } else {
            int i = 0;
            int j = 0;
            int size = arr.length;
            for (int k = 0; k < size; k++) {
                if (arr[k] == ll) i++;
                if (arr[k] == rr) j++;
            }
            return i > j ? ll : rr;
        }
    }
    // TODO write again
//    public int majorityElement(int[] nums) {
//        return find(nums, 0, nums.length - 1);
//    }
//
//    public int find(int[] arr, int l, int r) {
//        if (l == r) {
//            return arr[l];
//        }
//        int m = l + (r - l) / 2;
//        int left = find(arr, l, m);
//        int right = find(arr, m + 1, r);
//        if (left == right) {
//            return left;
//        }
//        int countL = 0;
//        int countR = 0;
//        int size = arr.length;
//        for (int i = 0; i < size; i++) {
//            countL = arr[i] == left ? countL + 1 : countL;
//            countR = arr[i] == right ? countR + 1 : countR;
//        }
//        return countL > countR ? left : right;
//    }
}
