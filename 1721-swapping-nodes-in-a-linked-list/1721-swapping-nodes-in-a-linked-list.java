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
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node = head;
        ListNode sec = head;
        
                
        for(int i = 1; i < k; i++){
            node = node.next;
        }
        ListNode temp = node;
        
        while(node.next != null){
            node = node.next;
            sec = sec.next;
        }
        
        int temp1 = temp.val;
        temp.val = sec.val;
        sec.val = temp1;
        
        
        return head;
    }
}