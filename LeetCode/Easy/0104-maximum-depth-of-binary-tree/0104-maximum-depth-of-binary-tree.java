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
 
 /*
A binary tree node Structure is as below the line.

 maxDepth(root)
│
├─ maxDepth(root.left)
│   ├─ maxDepth(root.left.left)
│   └─ maxDepth(root.left.right)
│
└─ maxDepth(root.right)
    ├─ maxDepth(root.right.left)
    └─ maxDepth(root.right.right)

  */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;  // 1. If the tree is empty, the depth is 0
        
        // 2. Recursively find the maximum depth of the left subtree
        int left = maxDepth(root.left);
        // 3. Recursively find the maximum depth of the right subtree
        int right = maxDepth(root.right);

        // 4. Return the larger depth between left and right subtree plus 1 for the current node
        return Math.max(left, right) + 1;
    }
}