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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length - 1, preorder, inorder);
        
    }
    
    public TreeNode helper(int i, int j, int n, int[] preorder, int[] inorder) {
        if (i > preorder.length - 1 || j > n) 
            return null;

        TreeNode root = new TreeNode(preorder[i]);
        int inIndex = 0;
        
        for (int c = j; c <= n; c++) 
            if (inorder[c] == root.val) 
                inIndex = c;
            
        root.left = helper(i + 1, j, inIndex - 1, preorder, inorder);
        root.right = helper(i + inIndex - j + 1, inIndex + 1, n, preorder, inorder);
        
        return root;
    }
}