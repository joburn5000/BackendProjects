
import java.util.Dictionary;
import java.util.Hashtable;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> solution = new ArrayList<>();
        if (digits.length() == 0) return solution;

        // dictionary mapping digit to strings
        Dictionary<Character, String> dict = new Hashtable<>();
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4', "ghi");
        dict.put('5', "jkl");
        dict.put('6', "mno");
        dict.put('7', "pqrs");
        dict.put('8', "tuv");
        dict.put('9', "wxyz");
      
        // iterative solution
        iterativeSolution(digits, dict, solution);
        return solution;
    }
    public void iterativeSolution(String digits, Dictionary<Character, String> dict, List<String> combinations) {
        int listSize = 1;
        for (char digit : digits.toCharArray()) {
            listSize *= dict.get(digit).length();
        }
        for (int i = 0; i<listSize; i++) {
            combinations.add("");
        }
        // skipNum helps calculate which letter to choose for a digit
        // the higher the value of skipNum, the more repetitions for that letter in the list
        // example: listSize = 6, skipNum = 3 => [a, a, a, b, b, b]
        // example: listSize = 6, skipNum = 1 => [a, b, a, b, a, b]
        int skipNum = listSize;
        for (char digit : digits.toCharArray()) {
            int numLetters = dict.get(digit).length();
            skipNum /= numLetters;
            for (int i = 0; i<listSize; i++) {
                // calculate the index based on the amount we are skipping by
                int nextLetterIndex = i / skipNum % numLetters;
                char nextLetter = dict.get(digit).charAt(nextLetterIndex);
                String combination = combinations.get(i) + nextLetter;
                combinations.set(i, combination);
            }
        }
    }

// Time Complexity: O(4^N)
// Space Complexity: O(4^N)
