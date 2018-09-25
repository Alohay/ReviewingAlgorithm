package leetcode;

public class Code_458_PoorPigs {
    public static void main(String[] args) {
        System.out.println(poorPigs(1000, 15, 60));
    }

    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (buckets <= 1) return 0;
        int n = minutesToTest / minutesToDie + 1;
        int count = 1;
        int m = n;
        while (m < buckets) {
            m *= n;
            count++;
        }
        return count;
    }
}
