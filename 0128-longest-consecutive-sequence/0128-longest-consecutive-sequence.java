import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);
        int min = Integer.MIN_VALUE;
        int ans =0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1==min)
            {
                count+=1;
                min=nums[i];
            }
                else if(nums[i]!=min)
                {
                   count=1;
                    min=nums[i];
                }
            ans=Math.max(ans,count);
            
        }
        return ans;
    }
}