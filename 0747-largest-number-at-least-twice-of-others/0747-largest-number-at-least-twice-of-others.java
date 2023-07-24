class Solution {
    public int dominantIndex(int[] nums) {
        int max =nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }
        int index =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != max && nums[i]*2>max)
                return -1;
            else if(nums[i]==max)
                index=i;
            
        }
        return index;
    }
}