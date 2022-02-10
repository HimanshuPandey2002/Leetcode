/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static int size(ListNode head){
        ListNode n = head;
        int size = 0;
        while(n != null){
            size++;
            n = n.next;
        }
        return size;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev = null;
        
        if(curr == null || curr.next == null)
            return curr;
        
        int size = size(curr);
        
        k = k % size;
        
        for(int i = 0; i < k; i++){
            ListNode start = curr;
            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            curr.next = start;
            
            if(prev != null)
                prev.next = null;
        }
        return curr;
    }
}