package leetcode;

public class Code_168_ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int i = (n - 1) % 26;
            sb.append((char) (65 + i));
            n = (n - 1) / 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
    }

}
