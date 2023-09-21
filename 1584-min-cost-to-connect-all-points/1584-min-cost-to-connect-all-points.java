class Solution {
    public int minCostConnectPoints(int[][] points) {
    Queue<int[]> queue = new PriorityQueue<>((a,b)->a[2]-b[2]);
        int n = points.length;
        int count = n-1;
        boolean vis[] = new boolean[n];
        vis[0]=true;
        for(int i=0;i<n;i++)
        {
            int d = dis(points[0],points[i]);
            queue.add(new int[]{0,i,d});
        }
        int cost =0;
        while(!queue.isEmpty() && count>0)
        {
            int row[] = queue.poll();
            int v1 = row[0];
            int v2 = row[1];
            int d = row[2];
            if(vis[v2]==false)
            {
               cost+=d;
                count--;
                vis[v2]=true;
                
                for(int i = 0;i<n;i++)
                {
                    if(vis[i]==false)
                    {
                        int distance = dis(points[v2],points[i]);
                        queue.add(new int[]{v2,i,distance});
                    }
                }
                
            }
            
        }
        return cost;
        
    }
    public int dis(int p1[],int p2[])
    {
        return Math.abs(p1[0]-p2[0])+Math.abs(p1[1]-p2[1]);
    }
}