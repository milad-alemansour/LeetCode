import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void Test1() {
        Solution main = new Solution();
        assertTrue(main.isValid("[[]]"));

    }

    @Test
    public void Test2() {
        Solution main = new Solution();
        assertTrue(main.isValid("()[]{}"));
    }

    @Test
    public void Test3() {
        Solution main = new Solution();
        assertFalse(main.isValid("(]"));

    }

    @Test
    public void Test4() {
        Solution main = new Solution();
        assertFalse(main.isValid("(){}}{"));

    }

    @Test
    public void Test5() {
        Solution main = new Solution();
        assertFalse(main.isValid("){"));

    }

    @Test
    public void Test6() {
        Solution main = new Solution();
        assertTrue(main.isValid("{[]}"));
    }

}