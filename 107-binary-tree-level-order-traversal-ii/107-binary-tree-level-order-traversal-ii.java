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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        
        if(root == null) return ans;
        que.add(root);
        
        while(!que.isEmpty()){
            int levelNum = que.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < levelNum; i++) {
                if(que.peek().left != null) que.add(que.peek().left);
                if(que.peek().right != null) que.add(que.peek().right);
                list.add(que.poll().val);
            }
            ans.add(list);
        }
        Collections.reverse(ans);
        return ans;
    }
}