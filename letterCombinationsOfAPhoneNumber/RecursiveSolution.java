
import java.util.Dictionary;
import java.util.Hashtable;

class RecursiveSolution {
    public List<String> letterCombinations(String digits) {
        // dictionary mapping digit to strings
        List<String> solution = new ArrayList<>();
        if (digits.length() == 0) return solution;

        Dictionary<String, String> dict = new Hashtable<>();
        dict.put("2", "abc");
        dict.put("3", "def");
        dict.put("4", "ghi");
        dict.put("5", "jkl");
        dict.put("6", "mno");
        dict.put("7", "pqrs");
        dict.put("8", "tuv");
        dict.put("9", "wxyz");
        // recursive solution
        recursiveSolution(digits, "", dict, solution);
        return solution;
    }
    public void recursiveSolution(String digits, String runningString, Dictionary<String, String> dict, List<String> combinations) {
        // recursively build a list
        // base case: "" add string to the list
        // recurseive case "[digit]..." build [digit] possibilities and process ...
            // 23, ""
            // "a", "b", "c"
        if (digits.length() == 0) {
            combinations.add(runningString);
        }
        else {
            for (char letter : dict.get(digits.substring(0,1)).toCharArray()) {
                recursiveSolution(digits.substring(1), runningString + letter, dict, combinations);
            }
        }
    }
}


// Time Complexity: O(4^N)
// Space Complexity: O(4^N)
