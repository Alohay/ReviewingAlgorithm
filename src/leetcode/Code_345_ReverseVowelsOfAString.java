package leetcode;

public class Code_345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int r = arr.length - 1;
        int l = 0;
        while (l < r) {
            if (isVowels(arr[l]) && isVowels(arr[r])) {
                swap(arr, l++, r--);
            } else if (isVowels(arr[r])) {
                l++;
            } else if (isVowels(arr[l])) {
                r--;
            } else {
                l++;
                r--;
            }
        }
        return String.valueOf(arr);
    }

    public void swap(char[] arr, int p, int q) {
        char c = arr[p];
        arr[p] = arr[q];
        arr[q] = c;
    }

    public boolean isVowels(char c) {
        c = Character.toLowerCase(c);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
