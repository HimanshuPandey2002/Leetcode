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
    public TreeNode sortedArrayToBST(int[] nums) {
        return (nums.length == 0) ? null : BST(nums, 0, nums.length-1);
    }
    
    public TreeNode BST(int[] nums, int i, int j){
        if(i > j) return null;
        int mid = i + (j-i)/2;
    
        TreeNode node = new TreeNode(nums[mid]);    
        node.right = BST(nums, mid+1, j);
        node.left = BST(nums, i, mid-1);
        
        return node;
    }
}