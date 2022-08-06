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
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return max;
    }
    
    public void find(TreeNode root){
        if(root == null) return ;
        max = Math.max(height(root.left) + height(root.right), max);
        find(root.left);
        find(root.right);
    }
    
    public int height(TreeNode root){
        return (root == null) ? 0 : Math.max(height(root.left), height(root.right))+1;
    }
}