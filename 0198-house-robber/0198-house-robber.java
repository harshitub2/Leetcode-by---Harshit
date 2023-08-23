class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        int n = nums.length;
        if(n==1)
            return nums[0];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length;i++)
        {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}