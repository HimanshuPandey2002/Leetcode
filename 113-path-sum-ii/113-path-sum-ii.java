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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        help(ans, new ArrayList<>(), root, targetSum);
        return ans;
    }
    
    public void help(List<List<Integer>> ans, List<Integer> path, TreeNode root, int sum){
        if(root == null) return;
        
        path.add(root.val);
        
        if(root.left == null && root.right == null){
            if(root.val == sum)
                ans.add(new ArrayList<>(path));
            return;
        }
        
        
        if(root.left != null){
            help(ans, path, root.left, sum-root.val);
            path.remove(path.size()-1);
        }
        
        if(root.right != null){
            help(ans, path, root.right, sum-root.val);
            path.remove(path.size()-1);
        }
    }
}