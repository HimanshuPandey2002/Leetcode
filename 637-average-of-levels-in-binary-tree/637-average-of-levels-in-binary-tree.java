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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<Double>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        
        if(root == null) return ans;
        que.add(root);
        
        while(!que.isEmpty()){
            int n = que.size();
            double sum = 0.0;
            
            for(int i = 0; i < n; i++) {
                TreeNode node = que.poll();
                sum += node.val;
                if(node.left != null) que.offer(node.left);
                if(node.right != null) que.offer(node.right);
            }
            ans.add(sum / n);
        }
        
        return ans;
    }
}