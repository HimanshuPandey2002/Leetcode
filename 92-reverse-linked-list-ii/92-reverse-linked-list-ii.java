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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        
        ListNode node = new ListNode(0); 
        node.next = head;
        ListNode prev = node;
        
        for(int i = 0; i < left - 1; i++)
            prev = prev.next;

        ListNode curr = prev.next;
        ListNode next = curr.next; 
        
        for(int i = 0; i < right - left ; i++) {
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = curr.next;
        }

        return node.next;
    }
}