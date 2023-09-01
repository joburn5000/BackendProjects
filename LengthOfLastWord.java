/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring consisting of non-space characters only.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int output = 0;
        int i = s.length()-1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i-=1;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            output += 1;
            i-=1;
        }
        return output;
    }
}

// Time complexity: O(N)
// Space complexity: O(1)
