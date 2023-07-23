class Solution {
    public long maxArrayValue(int[] nums) {
        long ans = (long)nums[nums.length-1];
        
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<=ans)
            {
                ans+=(long)nums[i];
            }
            else
            {
                ans=(long)nums[i];
            }
        }
        return ans;
    }
}