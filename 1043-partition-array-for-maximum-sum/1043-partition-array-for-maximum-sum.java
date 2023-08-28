class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int dp[] = new int[n+1];
        return maxSum(arr,k,dp);
        
        
    }
    int maxSum( int arr[], int k, int dp[])
    {
        int n = arr.length;
    for(int i=n-1;i>=0;i--)
        {
        int len =0;
        int maxi = Integer.MIN_VALUE;
        int maxiSum = Integer.MIN_VALUE;
            for(int j=i;j<Math.min(n,k+i);j++)
            {
                len++;
                maxi = Math.max(maxi,arr[j]);
                int sum = len*maxi+dp[j+1];
                maxiSum=Math.max(maxiSum,sum);
            }
        dp[i]=maxiSum;
        }
        return dp[0];
    }
}