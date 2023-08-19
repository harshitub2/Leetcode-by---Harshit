class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while(k!=0)
        {
            while(nums[i]<0 && k!=0)
            {
                nums[i]=-nums[i];
                k--;
                Arrays.sort(nums);
            }
            if(k==0)
            {
                break;
            }
           
            
             if(nums[i]==0)
            {
                nums[i]=-nums[i];
                k--;
            }
            else
            {
                nums[i]=-nums[i];
                k--;
            }
            
        }
        int sum =0;
        for(i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return sum;
    }
}