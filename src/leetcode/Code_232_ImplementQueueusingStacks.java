package leetcode;

import java.util.Stack;

public class Code_232_ImplementQueueusingStacks {
    class MyQueue {
        private Stack<Integer> stack;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            stack = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            stack.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            Stack<Integer> help = new Stack<>();
            while (!stack.empty()) {
                help.push(stack.pop());
            }
            Integer res = help.pop();
            while (!help.empty()) {
                stack.push(help.pop());
            }
            return res;
        }

        /**
         * Get the front element.
         */
        public int peek() {
            Stack<Integer> help = new Stack<>();
            while (!stack.empty()) {
                help.push(stack.pop());
            }
            Integer res = help.peek();
            while (!help.empty()) {
                stack.push(help.pop());
            }
            return res;
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack.empty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
