package leetcode;

public class Code_234_PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        int i = 0;
        int m = count / 2;
        ListNode next;
        ListNode pre = null;
        while (i < m) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            i++;
        }
        ListNode tmp = pre;
        // pre is on the head.prev
        next = count % 2 == 0 ? head : head.next;
        while (pre != null && next != null && pre.val == next.val) {
            pre = pre.next;
            next = next.next;
        }
        boolean res = false;
        if (pre == next) {
            res = true;
        }
        pre = tmp;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode t = new ListNode(1);
        t.next = new ListNode(2);
        t.next.next = new ListNode(1);
//        t.next.next = new ListNode(3);
//        t.next.next.next = new ListNode(3);
//        t.next.next.next = new ListNode(1);
//        t.next.next.next.next = new ListNode(2);
//        t.next.next.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(t));
        System.out.println(t.val);
    }
}
