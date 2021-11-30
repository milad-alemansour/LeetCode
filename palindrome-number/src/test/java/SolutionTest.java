import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindromeTest1() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void isPalindromeTest2() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(12321));
    }

    @Test
    void isPalindromeTest3() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void isPalindromeTest4() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome(-101));
    }

    @Test
    void isPalindrome2Test1() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome2(-121));
    }

    @Test
    void isPalindrome2Test2() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome2(12321));
    }

    @Test
    void isPalindrome2Test3() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome2(10));
    }

    @Test
    void isPalindrome2Test4() {
        Solution solution = new Solution();
        assertFalse(solution.isPalindrome2(-101));
    }
}