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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        int count =0;
        if(head==null || k==0||head.next==null)
            return head;
        while(curr!=null)
        {
            curr=curr.next;
            count++;
        }
        
            
        int idx = k%count;
        int c = count-idx;
        count=1;
        curr=head;
        while(count<c)
        {
            curr=curr.next;
            count++;
        }
        ListNode temp = curr.next;
        ListNode node = temp;
        if(curr.next!=null)
        {
        curr.next = null;
       while(node!=null && node.next!=null)
       {
           node=node.next;
       }
        node.next = head;
        return temp;
        }
        return head;
    }
}