/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void DFS(TreeNode root, List<Integer> output) {
        // check if it's null
        if (root != null) {
            // return left
            DFS(root.left, output);
            // return center
            output.add(root.val);
            // return right
            DFS(root.right, output);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        // initialize list
        List<Integer> output = new ArrayList<>();
        // call DFS search
        DFS(root, output);
        // return list
        return output;
        
    }
}

// Time complexity: O(N)
// Space complexity: O(N)

/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 
*/
