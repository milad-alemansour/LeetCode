public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x <= 9)
            return true;
        if (x % 10 == 0) return false;

        int y = 0;
        while (x >= y) {
            if (x == y) return true;
            y = y * 10 + x % 10;
            if (x == y) return true;
            x = x / 10;
        }
        return false;
    }

    public boolean isPalindrome2(int x) {
        int tempNumber = x;
        int reverseNumber = 0;
        while (tempNumber > 0) {
            reverseNumber = reverseNumber * 10 + tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        return x == reverseNumber;
    }
}
