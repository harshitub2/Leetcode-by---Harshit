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
    public ListNode removeNodes(ListNode head) {
        List<Integer> al = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null)
        {
            al.add(curr.val);
            curr=curr.next;
        }
        int max = al.get(al.size()-1);
        for(int i=al.size()-2;i>=0;i--)
        {
            if(al.get(i)>max)
            {
                max=al.get(i);
            }
            else if(al.get(i)<max)
            {
                al.remove(i);
            }
            
        }
         curr = new ListNode(al.get(0));
        ListNode temp = curr;
        for(int i=1;i<al.size();i++)
        {
            curr.next = new ListNode(al.get(i));
            curr=curr.next;
        }
        return temp;
    }
}