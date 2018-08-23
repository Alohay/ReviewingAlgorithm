package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Code_225_ImplementStackusingQueues {
    class MyStack {
        private Queue<Integer> q1;
        private Queue<Integer> q2;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            q1.add(x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            while (q1.size() > 1) {
                q2.add(q1.poll());
            }
            Queue<Integer> tmp = q2;
            q2 = q1;
            q1 = tmp;
            return q2.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
            while (q1.size() > 1) {
                q2.add(q1.poll());
            }
            Queue<Integer> tmp = q2;
            q2 = q1;
            q1 = tmp;
            int peek = q2.poll();
            q1.add(peek);
            return peek;
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
