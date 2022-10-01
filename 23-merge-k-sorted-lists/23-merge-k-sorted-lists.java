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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        
        PriorityQueue<ListNode> q= new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
            public int compare(ListNode o1,ListNode o2){
                if (o1.val<o2.val) return -1;
                else if (o1.val==o2.val) return 0;
                else return 1;
            }
        });
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        for (ListNode node:lists)
            if (node != null) q.add(node);
            
        while (!q.isEmpty()){
            tail.next = q.poll();
            tail = tail.next;
            
            if (tail.next!=null) q.add(tail.next);
        }
        return dummy.next;
    }
}