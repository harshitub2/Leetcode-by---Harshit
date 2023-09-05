/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node curr = head;
        while(curr!=null)
        {
            Node node = new Node(curr.val);
            map.put(curr,node);
            curr=curr.next;
        }
        curr= head;
        while(curr!=null)
        {
            if(curr.next!=null)
            {
                map.get(curr).next=map.get(curr.next);
               
            }
            else
                map.get(curr).next=null;
            if(curr.random!=null)
                map.get(curr).random=map.get(curr.random);
            else
                map.get(curr).random=null;
            curr=curr.next;
        }
       return map.get(head);
        
    }
}