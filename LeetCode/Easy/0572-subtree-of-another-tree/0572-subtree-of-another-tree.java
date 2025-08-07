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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // If root is null, subRoot cannot be a subtree
        if(root == null) return false;

        // Check if the trees rooted at root and subRoot are identical
        if(isSameTree(root, subRoot)) return true;

         // Otherwise, recursively check if subRoot is a subtree of left or right child of root
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Checks if two trees p and q are exactly the same
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both nodes are null, trees are identical
        if(p == null && q == null) return true;

        // One of the nodes is null, trees are different
        if(p == null || q == null) return false;

        // Values of current nodes differ, trees are different
        if(p.val != q.val) return false;

        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}