package leetcode;

public class Code_203_RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        while (head != null && head.val == val) head = head.next;
        ListNode keep = head;
        ListNode pre = head;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
            } else {
                pre = head;
            }
            head = head.next;

        }
        return keep;
    }
}
