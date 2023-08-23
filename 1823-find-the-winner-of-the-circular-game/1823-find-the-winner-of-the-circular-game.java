class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            q.offer(i);
        }
        while(q.size()>1)
        {
            int del = k-1;
            while(del>0)
            {
                q.offer(q.remove());
                del--;
            }
            q.remove();
        }
        return q.peek();
    }
}