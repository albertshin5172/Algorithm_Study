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
    public boolean isSymmetric(TreeNode root) {
        // compare the recursive  with the left and right subtrees
        return isTreeSymmetric(root.left, root.right);
    }

    public boolean isTreeSymmetric(TreeNode leftRoot, TreeNode rightRoot) {
        // If both subtrees are empty, it is symmetric
        if (leftRoot == null && rightRoot == null) return true;

        // If one subtree is empty and the other is not, it means not symmetric
        if ((leftRoot == null && rightRoot != null) || 
            (leftRoot != null && rightRoot == null)) return false;

        // if values at current nodes do not match it means not symmetric
        if (leftRoot.val != rightRoot.val) return false;

        // Recursively check for mirror symmetry:
        // left subtree's left with right subtree's right,
        // and left subtree's right with right subtree's left
        return isTreeSymmetric(leftRoot.left, rightRoot.right) &&
               isTreeSymmetric(leftRoot.right, rightRoot.left);
    }
}