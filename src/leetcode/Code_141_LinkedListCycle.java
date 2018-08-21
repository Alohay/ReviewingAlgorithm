package leetcode;

public class Code_141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p2 = p2.next.next;
            p1 = p1.next;
            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }
}
