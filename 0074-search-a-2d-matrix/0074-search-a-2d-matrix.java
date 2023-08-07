class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row =0;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[row][matrix[0].length-1]==target)
                return true;
            else if(matrix[row][matrix[0].length-1]>target)
                break;
            else 
            {
                row++;
            }
        }
        if(row>=matrix.length)
            return false;
        for(int i=0;i<matrix[0].length;i++)
        {
           
            if(matrix[row][i]==target)
                return true;
        }
        return false;
    }
}