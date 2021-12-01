import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    public void SolutionTest1() {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        Solution solution = new Solution();
        boolean result = solution.hasCycle1(listNode1);
        assertTrue(result);

    }


    @Test
    public void SolutionTest2() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode1;
        Solution solution = new Solution();
        boolean result = solution.hasCycle1(listNode1);
        assertTrue(result);

    }

    @Test
    public void SolutionTest3() {
        ListNode listNode1 = new ListNode(3);
        Solution solution = new Solution();
        boolean result = solution.hasCycle1(listNode1);
        assertFalse(result);

    }

    @Test
    public void Solution2Test1() {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        Solution solution = new Solution();
        boolean result = solution.hasCycle2(listNode1);
        assertTrue(result);

    }


    @Test
    public void Solution2Test2() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode1;
        Solution solution = new Solution();
        boolean result = solution.hasCycle2(listNode1);
        assertTrue(result);

    }

    @Test
    public void Solution2Test3() {
        ListNode listNode1 = new ListNode(3);
        Solution solution = new Solution();
        boolean result = solution.hasCycle2(listNode1);
        assertFalse(result);

    }


}
