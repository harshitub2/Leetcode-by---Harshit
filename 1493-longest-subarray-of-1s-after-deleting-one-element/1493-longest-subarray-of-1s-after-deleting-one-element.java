class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left =0;
        int zeros = 0;
        int maxi =0;
        for(int right =0;right<n;right++)
        {
            if(nums[right]==0)
                zeros++;
            while(zeros>1)
            {
                if(nums[left]==0)
                    zeros--;
                left++;
            }
            maxi=Math.max(maxi,right-left);
        }
        return maxi;
    }
}