class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int vis[][] = new int[m][n];
        int dis[][] = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    vis[i][j]=1;
                    dis[i][j]=1;
                    q.add(new int[]{i,j,0});
                    
                }
                
            }
        }
        while(!q.isEmpty())
        {
        int drow[] = new int[]{-1,1,0,0};
        int dcol[] = new int[]{0,0,1,-1};
        int row[] = q.poll();
        int r = row[0];
        int c = row[1];
        int steps = row[2];
            dis[r][c]=steps;
       for(int i=0;i<4;i++)
       {
           int nrow = r + drow[i];
           int ncol = c + dcol[i];
           if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0)
           {
               vis[nrow][ncol]=1;
               q.add(new int[]{nrow,ncol,steps+1});
           }
       }
            
            
        }
        return dis;
        
    }
}