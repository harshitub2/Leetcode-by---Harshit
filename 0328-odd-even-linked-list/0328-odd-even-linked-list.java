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
    public ListNode oddEvenList(ListNode head) {
    
    ListNode odd = null;
    ListNode oddt =null;
    ListNode even = null;
    ListNode event = null;
    ListNode curr = head;
        int i =1;
        while(curr!=null)
        {
            if(i%2!=0)
            {
                if(odd==null)
                {
                    odd=curr;
                    oddt=curr;
                }
                else
                {
                    oddt.next=curr;
                    oddt=oddt.next;
                }
            }
                else
                {
                    if(even==null)
                    {
                        even = curr;
                        event= curr;
                    }
                    else
                    {
                        event.next=curr;
                        event=event.next;
                    }
                }
            curr=curr.next;
            i++;
            }
        if(even!=null)
        {
            event.next=null;
        }   
        if(odd==null)
        {
            return even;
        }
        else
        {
            oddt.next=even;
            return odd;
        }
        
    }
}