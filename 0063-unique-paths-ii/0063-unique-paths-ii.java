class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
       int ans [][] = new int[m][n];
        ans[0][0]=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(i>0)// && ans[i-1][j]!=-1)
                    ans[i][j]=ans[i-1][j];
                if(j>0) //&& ans[i][j-1]!=-1)
                    ans[i][j]+=ans[i][j-1];
                if(obstacleGrid[i][j]==1)
                    ans[i][j]=0;
            }
        }
        return ans[m-1][n-1];
    }
}