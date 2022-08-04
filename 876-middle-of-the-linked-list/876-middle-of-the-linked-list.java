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
//     public ListNode middleNode(ListNode head) {
//         ListNode node = head;
//         int count = 0;
//         while(node.next != null){
//             node = node.next;
//             count++;
//         }
//         node = head;
//         int mid = (count % 2 == 0) ? count/2 : count/2+1 ;
        
//         for(int i = 0; i < mid; i++)
//             node = node.next;
        
//         return node;
//     }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        
        while(fast.next != null){
            slow = slow.next;
            fast = (fast.next.next != null) ? fast.next.next : fast.next;
        }
        return slow;
    }
}