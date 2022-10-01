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
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < lists.length; i++){
            ListNode node = lists[i];
            
            while(node != null){
                pq.add(node.val);
                node = node.next;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        while(!pq.isEmpty())
            list.add(pq.remove());
        
        if(list.size() == 0) return null;
        
        ListNode node = new ListNode();
        ListNode ans = node;
        
        for(int i: list){
            node.next = new ListNode(i);
            node = node.next;
        }
        
        return ans.next;
    }
}