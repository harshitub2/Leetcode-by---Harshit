class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int dir[][] = new int[][]{{-1,0},{-1,-1},{-1,1},{1,0},{1,1},{1,-1},{0,-1},{0,1}};
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                int live =0;
               for(int d[]: dir)
               {
                   int x = i+d[0];
                   int y = j+d[1];
                   if(x>=0 && y>=0 && x<m && y<n)
                   {
                       if(board[x][y]==1 || board[x][y]==-1)
                           live++;
                   }
               }
                   if(board[i][j]==1 && live<2 || board[i][j]==1 && live>3)
                   {
                       board[i][j]=-1;
                   }
                   else if(board[i][j]==0 && live==3)
                    {
                                    board[i][j]=2;
                                }
                       
               
                                
            }
        }
                        for(int i=0;i<m;i++)
                                {
                                    for(int j=0;j<n;j++)
                                    {
                                        if(board[i][j]==2)
                                        {
                                            board[i][j]=1;
                                        }
                                        else if(board[i][j]==-1)
                                        {
                                            board[i][j]=0;
                                        }
                                    }
                                }
  
    }
}