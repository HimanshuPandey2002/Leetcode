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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null, slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        ListNode n1 = sortList(head);
        ListNode n2 = sortList(slow);
        
        return merge(n1, n2);
    }
    
    ListNode merge(ListNode n1, ListNode n2){
        ListNode l = new ListNode(0), p = l;
        
        while(n1 != null && n2 != null){
            if(n1.val < n2.val){
                p.next = n1;
                n1 = n1.next;
            } else {
                p.next = n2;
                n2 = n2.next;
            }
            p = p.next;
        }
        
        if(n1 != null)
            p.next = n1;
        if(n2 != null)
            p.next = n2;
        return l.next;
        
    }
}