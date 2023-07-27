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
    public void reorderList(ListNode head) {
        int count =0;
        ListNode curr = head;
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
        
        for(int i=1;i<arr.length;i=i+2)
        {
            for(int j=arr.length-1;j>i;j--)
            {
                ListNode temp =arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
            
        }
        ListNode node = arr[0];
        curr=node;
        for(int i=1;i<arr.length;i++)
        {
            curr.next=arr[i];
            curr=curr.next;
        }
        curr.next=null;
    }
}