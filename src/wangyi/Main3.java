package wangyi;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] peo = new int[m + 1];
        Queue<Vote> heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int voteTo = in.nextInt();
            heap.add(new Vote(voteTo, in.nextInt()));
            peo[voteTo]++;
        }
        int maxIndex = 0;
        for (int i = 0; i < m; i++) {
            maxIndex = peo[maxIndex] > peo[i + 1] ? maxIndex : i + 1;
        }
        List<Integer> list = new ArrayList<>();
        list.add(maxIndex);
        for (int i = 0; i < m; i++) {
            if (peo[maxIndex] == peo[i]) list.add(i);
        }
        if (maxIndex == 1) {
            System.out.println(0);
            return;
        }
        int res = Integer.MAX_VALUE;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int mIndex = list.get(i);
            int has = peo[1];
            int cost = 0;
            List<Vote> outed = new ArrayList<>();
            while (has <= peo[mIndex] && !heap.isEmpty()) {
                Vote poll = heap.poll();
                outed.add(poll);
                if (poll.voteTo == mIndex) peo[mIndex]--;
                has++;
                cost += poll.candy;
            }
            res = Math.min(cost, res);
            heap.addAll(outed);
        }
        System.out.println(res);
    }

    static class Vote implements Comparable<Vote> {
        int voteTo;
        int candy;

        public Vote(int voteTo, int candy) {
            this.voteTo = voteTo;
            this.candy = candy;
        }

        @Override
        public int compareTo(Vote o) {
            return candy - o.candy;
        }
    }

}
