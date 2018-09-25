package dfcaifu;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] n = in.nextLine().split(",");
        process(n);
    }

    public static void process(String[] arr) {
        int size = arr.length;
        Stack<Integer> stack = new Stack<>();
        int min = Integer.MAX_VALUE;
        int idx = -1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int item = Integer.parseInt(arr[i]);
            // ? isEmpty 不行
            while (!stack.empty() && Integer.parseInt(arr[stack.peek()]) > item) {
                int pop = stack.pop();
                if (!stack.empty())
                    sb.append(idx + 1).append(" ").append(pop + 1).append(" ");
                while (!stack.empty()) {
                    stack.pop();
                }
                min = item;
                idx = i;
            }
            stack.push(i);
            if (min > item) {
                min = item;
                idx = i;
            }
        }
        if (stack.size() == 5) {
            int end = stack.pop() + 1;
            int sta = idx + 1;
            System.out.println(sta + " " + end + " 0 0");
            return;
        }
        if (!stack.empty()) {
            int end = stack.pop() + 1;
            if (!stack.empty())
                sb.append(idx + 1).append(" ").append(end);
        }
        if (sb.length() == 4) {
            sb.append("0 0");
        } else if (sb.length() == 0) {
            sb.append("0 0 0 0");
        }
        // sb.length > 8?
        System.out.println(sb);
    }
}
