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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count =0;
        ListNode curr = head;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        curr = head;
        ListNode arr[] = new ListNode[count];
        for(int i=0;i<count;i++)
        {
            arr[i]=curr;
            curr=curr.next;
        }
        int l = left-1;
        int r = right -1;
        while(l<r)
        {
            ListNode temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        ListNode node = arr[0];
        curr = node;
        for(int i=1;i<count;i++)
        {
            curr.next=arr[i];
            curr=curr.next;
        }
        curr.next = null;
        return node;
    }
}