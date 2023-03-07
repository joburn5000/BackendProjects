class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {  // negative numbers cannot be palindromes
            return false;
        }
        
        int reversed = 0;
        int original = x;
        
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        return reversed == original;
    }
}
