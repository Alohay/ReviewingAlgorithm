package leetcode;

import java.util.Stack;

public class Code_155_MinStack {
    class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> help;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<>();
            help = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (help.empty() || x <= help.peek()) {
                help.push(x);
            }
        }

        public void pop() {
            Integer pop = stack.pop();
            if (pop.equals(help.peek())) {
                help.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return help.peek();
        }
    }

}
