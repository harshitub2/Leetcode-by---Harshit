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
        Map<Node,Node> map= new HashMap<>();
        Node temp = head;
        while(temp!=null)
        {
            Node node = new Node(temp.val);
            map.put(temp,node);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
           Node node = map.get(temp);
            if(temp.next!=null)
            {
                map.get(temp).next=map.get(temp.next);
            }
            else
            {
               map.get(temp).next=null;
            }
            if(temp.random!=null)
            {
                map.get(temp).random = map.get(temp.random);
            }
            else
            {
                map.get(temp).random  = null;
            }
            temp=temp.next;
        }
        return map.get(head);
    }
}