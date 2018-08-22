package leetcode;

public class Code_171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int size = s.length();
        int count = 1;
        int res = 0;
        for (int i = size - 1; i >= 0; i--) {
            res += (s.charAt(i) - 'A' + 1) * count;
            count *= 26;
        }
        return res;
    }
}
