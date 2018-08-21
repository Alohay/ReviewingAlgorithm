package leetcode;

public class Code_160_IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int countA = 0;
        int countB = 0;
        while (a != null) {
            countA++;
            a = a.next;
        }
        while (b != null) {
            countB++;
            b = b.next;
        }
        int r = countB - countA;
        if (r > 0) {
            while (r > 0) {
                headB = headB.next;
                r--;
            }
        } else {
            while (r < 0) {
                headA = headA.next;
                r++;
            }
        }
        while (headA != headB && headA != null) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}
