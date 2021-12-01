import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    /*Fastest Solution*/
    public boolean hasCycle1(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;

    }

    public boolean hasCycle2(ListNode head) {
        Map<ListNode, Integer> hashMap = new HashMap<>();
        if (head == null) return false;
        if (head.next == null) return false;
        while (head.next != null) {
            if (hashMap.get(head) != null) return true;
            hashMap.put(head, 0);
            head = head.next;
            if (hashMap.get(head) != null) return true;
        }

        return false;

    }
}
