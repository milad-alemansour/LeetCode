import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    /*
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    */
    void twoSumSolution1Example1() {
        Solution solution = new Solution();
        int[] test = new int[]{2, 7, 11, 15};
        int testTarget = 9;
        int[] result = new int[]{0, 1};
        assertArrayEquals(result, solution.twoSumSolution1(test, testTarget));
    }

    @Test
    void twoSumSolution1Example2() {
        Solution solution = new Solution();
        int[] test = new int[]{3, 2, 4};
        int testTarget = 6;
        int[] result = new int[]{1, 2};
        assertArrayEquals(result, solution.twoSumSolution1(test, testTarget));
    }

    @Test
    void twoSumSolution1Example3() {
        Solution solution = new Solution();
        int[] test = new int[]{3, 3};
        int testTarget = 6;
        int[] result = new int[]{0, 1};
        assertArrayEquals(result, solution.twoSumSolution1(test, testTarget));
    }

    @Test
    void twoSumSolution2Example1() {
        Solution solution = new Solution();
        int[] test = new int[]{2, 7, 11, 15};
        int testTarget = 9;
        int[] result = new int[]{0, 1};
        assertArrayEquals(result, solution.twoSumSolution2(test, testTarget));
    }

    @Test
    void twoSumSolution2Example2() {
        Solution solution = new Solution();
        int[] test = new int[]{3, 2, 4};
        int testTarget = 6;
        int[] result = new int[]{1, 2};
        assertArrayEquals(result, solution.twoSumSolution2(test, testTarget));
    }

    @Test
    void twoSumSolution2Example3() {
        Solution solution = new Solution();
        int[] test = new int[]{3, 3};
        int testTarget = 6;
        int[] result = new int[]{0, 1};
        assertArrayEquals(result, solution.twoSumSolution2(test, testTarget));
    }
}