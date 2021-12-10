public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow;
        ListNode reverse = new ListNode(head.val);
        if (head.next == null) {
            return head;
        }
        slow = head.next;
        while (slow != null) {
            reverse = new ListNode(slow.val, reverse);
            slow = slow.next;

        }


        return reverse;
    }
}
