package webank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Item> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Item(in.nextInt(), in.nextInt()));
        }
        process(list);
    }

    public static void process(List<Item> list) {
        int size = list.size();
        double d = Integer.MAX_VALUE;
        HashMap<Double, Item> map = new HashMap<>(100);
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                Item item = list.get(j);
                double dis = getDis(list.get(i), item);
                if (dis == -1) continue;
                map.put(dis, item);
                d = Math.min(d, dis);
            }
            setDis(list.get(i), map.get(d), d);
            map.clear();
            d = Integer.MAX_VALUE;
        }

        for (int i = 0; i < size - 1; i++) {
            System.out.printf("%.3f ", list.get(i).len);
        }
        System.out.printf("%.3f", list.get(size - 1).len);
    }

    public static void setDis(Item a, Item b, double dis) {
        if (b == null || (a.len != 0 && b.len != 0)) {
            return;
        }
        if (a.len != 0) {
            b.len = dis;
        } else if (b.len != 0) {
            a.len = dis;
        } else {
            a.len = dis;
            b.len = dis;
        }
    }

    public static double getDis(Item a, Item b) {
        if (a.len != 0.0 && b.len != 0.0) {
            return -1;
        }
        double d = Math.sqrt(Math.abs(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2)));
        if (a.len != 0.0) {
            // ? return 负数
            return d - a.len;
        } else if (b.len != 0.0) {
            return d - b.len;
        } else {
            return d / 2.0;
        }
    }
}

class Item {
    int x;
    int y;
    double len;

    public Item(int x, int y) {
        this.x = x;
        this.y = y;
        len = 0.0;
    }
}
