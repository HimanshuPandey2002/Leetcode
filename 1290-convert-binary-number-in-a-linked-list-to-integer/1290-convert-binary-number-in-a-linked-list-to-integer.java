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
    public int size(ListNode head){
        ListNode n= head;
        int count = 0;
        
        while(n != null){
            count++;
            n = n.next;
        }
        return count;
    }
    
    public int getDecimalValue(ListNode head) {
        ListNode n = head;
        int total_sum = 0;
        int size = size(head);

        while(n != null){
            total_sum = total_sum + (int)(n.val * Math.pow(2, size-1));
            size--;
            n=n.next;
        }
        return total_sum;
    }
}