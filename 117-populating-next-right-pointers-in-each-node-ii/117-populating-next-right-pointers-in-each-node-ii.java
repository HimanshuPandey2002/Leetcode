/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
      Node head = new Node(0);
      Node prev = head; 
      Node real_root = root;
        
      while(root != null){
          if(root.left != null){
              prev.next = root.left;
              prev = prev.next;
          }
          if(root.right != null){
              prev.next = root.right; 
              prev = prev.next;
          }
          root = root.next; 
          if(root == null){
              prev = head;  
              root = head.next;
              head.next = null;
          }
      }
        return real_root;
    }
}