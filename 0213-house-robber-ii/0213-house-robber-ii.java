class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if(n==2)
            return Math.max(nums[0],nums[1]);
        
        // Calculate the maximum amount by either robbing houses from 0 to n-2 or from 1 to n-1
        int max1 = robHelper(nums, 0, n - 2);
        int max2 = robHelper(nums, 1, n - 1);
        
        // Return the maximum amount between the two cases
        return Math.max(max1, max2);
    }
    
    // Helper function to calculate the maximum amount by dynamic programming
     int robHelper(int[] nums, int start, int end) {
        int dp[] = new int[nums.length-1];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = 2; i <= end - start; i++) {
            dp[i] = Math.max(nums[start + i] + dp[i - 2], dp[i - 1]);
        }
        return dp[end - start];
    }
}
