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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode ans = prev;
        
        int carry = 0;
       // int sum =0;
        while(l1!=null || l2!=null || carry==1)
        {
            int sum =0;
            if(l1!=null)
            {
            sum+=l1.val;
            l1=l1.next;
            }
            if(l2!=null)
            {
            sum+=l2.val;
            l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode node = new ListNode(sum%10);
            prev.next=node;
            prev=prev.next;
            
            
        }
        return ans.next;
    }
}