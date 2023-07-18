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
        List<Integer> list = new ArrayList<>(); 
        if(head==null)
            return head;
        ListNode curr = head;
        while(curr!=null)
        {
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(list);
        head.val=list.get(0);
        curr=head;
        for(int i=1;i<list.size();i++)
        {
            curr.next=new ListNode(list.get(i));
            curr=curr.next;
        }
        return head;
        
    }
}