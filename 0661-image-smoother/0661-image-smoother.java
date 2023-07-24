class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int arr[][] = new int[m][n];
         for(int i=0;i<m;i++)
        {
             
            for(int j=0;j<n;j++)
            {
                arr[i][j]=img[i][j];
            }
         }
        
        int dir[][] = new int[][]{{0,-1},{0,1},{-1,0},{-1,-1},{-1,1},{1,0},{1,-1},{1,1}};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum =arr[i][j];
                int count=1;
                for(int d[]:dir)
                {
                    int x = i + d[0];
                    int y = j + d[1];
                    if(x>=0 && x<m && y>=0 && y<n)
                    {
                        sum+=arr[x][y];
                        count++;
                    }
                }
                img[i][j]=(int)Math.floor(sum/count);
            }
        }
        return img;
    }
}