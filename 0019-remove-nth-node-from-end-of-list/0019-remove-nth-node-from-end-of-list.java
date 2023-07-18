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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int count=1;
        while(curr.next!=null)
        {
            curr=curr.next;
            count++;
        }
        if(n==count)
        {
            head=head.next;
            return head;
        }
        int index = count-n;
        count=1;
        curr=head;
        while(count<index)
        {
            curr=curr.next;
            count++;
        }
       
        curr.next=curr.next.next;
       
        return head;
    }
}