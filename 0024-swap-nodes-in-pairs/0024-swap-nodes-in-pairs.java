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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode curr = head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        curr=head;
        ListNode arr[] = new ListNode[count];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=curr;
            curr=curr.next;
        }
        for(int i=0;i<arr.length-1;i=i+2)
        {
            ListNode temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        ListNode node = arr[0];
        curr=node;
        for(int i=1;i<arr.length;i++)
        {
            curr.next=arr[i];
            curr=curr.next;
        }
        curr.next=null;
        return node;
    }
}