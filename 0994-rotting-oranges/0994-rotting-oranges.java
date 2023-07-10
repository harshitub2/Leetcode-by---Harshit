class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count =0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]!=0)
                    count++;
            }
        }
        int countmin=0;
        int c =0;
        int dx[]={0,0,1,-1};
        int dy[] ={1,-1,0,0};
        while(!q.isEmpty())
        {
            int size = q.size();
            c+=size;
            for(int i=0;i<size;i++)
            {
                int point[] = q.poll();
                for(int j=0;j<4;j++)
                {
                    int x = point[0] +dx[j];
                    int y = point[1]+dy[j];
                    if(x<0 || y<0 || x>=m || y>=n || grid[x][y]==0 || grid[x][y]==2)
                        continue;
                    grid[x][y]=2;
                    q.add(new int[]{x,y});
                }
            }
            if(!q.isEmpty())
                countmin++;
                
        }
        return count==c?countmin:-1;
    }
}