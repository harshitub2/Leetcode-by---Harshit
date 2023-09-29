class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]>=nums[i])
                continue;
            else
            {
                inc = false;
                break;
            }
            
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]<=nums[i])
                continue;
            else
            {
                dec = false;
                break;
            }
        }
        return inc==true || dec == true?true:false;
    }
}