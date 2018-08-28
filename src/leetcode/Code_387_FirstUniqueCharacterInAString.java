package leetcode;

public class Code_387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        char[] ca = s.toCharArray();
        int size = ca.length;
        for (int i = 0; i < size; i++) {
            int index = ca[i] - 97;
            if (arr[index] > -1) {
                arr[index] = -2;
            } else {
                arr[index] = i;
            }
        }
        int min = size;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > -1) min = Math.min(arr[i], min);
        }
        return min == size ? -1 : min;
    }
}
