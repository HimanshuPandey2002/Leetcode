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
    TreeNode xp = null, yp = null;
    int xd = -1, yd = -1;
    
    public boolean isCousins(TreeNode root, int x, int y) {       
        getVals(root, x, y,null, 0);
        return xd == yd && xp != yp;
    }
    
    public void getVals(TreeNode root, int x, int y, TreeNode parent, int depth){
        if(root == null) return ;
        
        if(root.val == x){
            xp = parent;
            xd = depth;
        }
        
        if(root.val == y){
            yp = parent;
            yd = depth;
        }
        
        getVals(root.left, x, y, root, depth+1);
        getVals(root.right, x, y, root, depth+1);
    }
}