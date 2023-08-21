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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next==null)
        {
            return head;
        }
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
       int count=0;
        
        while(curr!=null && count<k)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
            count++;
        }
        if(next!=null && size(next)>=k)
        {
            head.next = reverseKGroup(next,k);
        }
        else
        {
            head.next = next;
        }
        return prev;
    }
    int size(ListNode head)
    {
        if(head==null)
            return 0;
        if(head.next==null)
            return 1;
            int p=0;
        while(head!=null)
        {
            head=head.next;
            p++;
        }
        return p;
    }
}