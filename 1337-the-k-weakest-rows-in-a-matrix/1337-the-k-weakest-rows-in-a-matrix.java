class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
       int arr[][] = new int[n][2];
        for(int i=0;i<n;i++)
        {
            int count =0;
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                    count++;
            }
            arr[i][0]=i;
            arr[i][1]=count;
        }
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int ans[] = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=arr[i][0];
        }
        return ans;
    }
}