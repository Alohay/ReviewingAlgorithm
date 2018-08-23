package leetcode;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
public class Code_206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode next;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

//    public static ListNode reverseList1(ListNode head) {
//        // TODO recursively type
//}

//    public static void main(String[] args) {
//        ListNode l = new ListNode(1);
//        l.next = new ListNode(2);
//        l.next.next = new ListNode(3);
//        l = reverseList1(l);
//        System.out.println(l);
//    }
}
