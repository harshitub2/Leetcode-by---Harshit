class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int val = matrix[i][j];
                if(i<m-1 && j<n-1 && matrix[i+1][j+1]!=val)
                {
                    return false;
                }
            }
        }
        return true;
    }
}