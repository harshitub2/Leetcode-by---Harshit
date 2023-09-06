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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode arr[] = new ListNode[k];
        ListNode curr = head;
        int count =0;
        while(curr!=null)
        {
            curr=curr.next;
            count++;
        }
        curr = head;
        int part = count/k;
        int extra = count%k;
        for(int i=0;i<Math.min(count,k);i++)
        {
            int currpart = part;
            arr[i]=curr;
            if(extra>0)
            {
                currpart = part + 1;
                extra--;
            }
            for(int j=0;j<currpart-1;j++)
            {
                curr=curr.next;
            }
            ListNode next = curr.next;
            curr.next = null;
            curr = next;
        }
        return arr;
    }
}