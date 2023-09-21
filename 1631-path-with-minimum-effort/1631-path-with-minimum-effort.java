class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int dir[][] = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        int d[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(d[i],Integer.MAX_VALUE);
        }
        queue.offer(new int[]{0,0,0});
        d[0][0]=0;
        while(!queue.isEmpty())
        {
            int top[] =queue.poll();
            int dis = top[0];
            int row = top[1];
            int col = top[2];
            if(row==m-1 && col==n-1)
                return dis;
            for(int i=0;i<4;i++)
            {
                int x = row + dir[i][0];
                int y = col + dir[i][1];
                
                if(x>=m || x<0 || y>=n || y<0)
                    continue;
                int newDist = Math.max(dis,Math.abs(heights[row][col]-heights[x][y]));
                    if(d[x][y]>newDist)
                    {
                        d[x][y]=newDist;
                        queue.offer(new int[]{d[x][y],x,y});
                    }
                }
                
            }
        
        return -1;
        }
        
    
}