package leetcode;

public class Code_434_NumberofSegmentsinaString {
    public static int countSegments(String s) {
        if (s == null) return 0;
        s = s.trim();
        if (s.length() == 0) return 0;
        return s.trim().split("\\s+").length;

    }
}
