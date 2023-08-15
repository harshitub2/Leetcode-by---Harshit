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
    public ListNode partition(ListNode head, int x) {
        ListNode temp1 = new ListNode(0);
        ListNode temp2 = new ListNode(0);
       // temp1.next = head;
        ListNode curr = head;
        ListNode first = temp1;
        ListNode second = temp2;
        
        while(curr!=null)
        {
            ListNode temp = curr.next;
            if(curr.val<x)
            {
                first.next=curr;
                first=curr;
            }
            else
            {
                second.next = curr;
                second = curr;
                second.next=null;
            }
            curr=temp;
        }
        first.next=temp2.next;
        return temp1.next;
        
    }
}