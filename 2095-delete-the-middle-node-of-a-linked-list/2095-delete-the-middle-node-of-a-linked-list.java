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
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
      int count =1;
        while(curr.next!=null)
        {
            curr=curr.next;
            count++;
        }
        int del = count/2;
        if(head.next==null)
        {
        head=head.next;
        return head;
        }
        curr=head;
        count=1;
        while(count<del)
        {
            curr=curr.next;
            count++;
        }
        curr.next=curr.next.next;
        return head;
    }
}