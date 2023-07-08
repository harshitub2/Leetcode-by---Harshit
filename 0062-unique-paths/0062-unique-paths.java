class Solution {
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m+1][n+1];
        return paths(m,n,arr);
    }
        
        int paths(int m, int n, int[][] arr)
        {
        if(m<0 || n<0)
            return 0;
            if(m==1 && n==1)
                return 1;
            if(arr[m][n]!=0)
                return arr[m][n];
            
            arr[m][n]=paths(m-1,n,arr) + paths(m,n-1,arr);
            return arr[m][n];
        }
        
        
    
}