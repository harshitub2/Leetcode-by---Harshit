/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null)
        {
            if(!list.contains(curr))
            {
                list.add(curr);
                curr=curr.next;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}