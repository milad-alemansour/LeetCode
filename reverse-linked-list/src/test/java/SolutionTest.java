import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void reverseList() {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        Solution solution = new Solution();
        ListNode reverseList = solution.reverseList(listNode1);
        //TODO: Test Case needs to implement


    }
}