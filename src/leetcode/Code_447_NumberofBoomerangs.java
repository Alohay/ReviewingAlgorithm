package leetcode;

import java.util.HashMap;

public class Code_447_NumberofBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int size = points.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) continue;
                int dis = dis(points[i], points[j]);
                map.put(dis, map.getOrDefault(dis, 0) + 1);
            }
            for (Integer value : map.values()) {
                res += value * (value - 1);
            }
            map.clear();
        }

        return res;
    }

    public int dis(int[] p1, int[] p2) {
        int x = p1[0] - p2[0];
        int y = p1[1] - p2[1];
        return x * x + y * y;
    }

}
