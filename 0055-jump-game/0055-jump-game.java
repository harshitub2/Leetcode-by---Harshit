class Solution {
    public boolean canJump(int[] nums) {
        int left = nums[0];
        if(nums.length==1)
            return true;
        int index =1;
        while(left>0)
        {
            if(index==nums.length-1)
            {
                return true;
            }
            left = Math.max(left-1,nums[index]);
            index++;
            }
        return false;
    }
}