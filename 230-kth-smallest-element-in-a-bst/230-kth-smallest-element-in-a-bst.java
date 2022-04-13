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
    LinkedList<Integer> list = new LinkedList<Integer>();
    
    public void inOrder(TreeNode root){
        if(root == null) return ;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        System.out.println(list);
        return list.get(k-1);
    }
}