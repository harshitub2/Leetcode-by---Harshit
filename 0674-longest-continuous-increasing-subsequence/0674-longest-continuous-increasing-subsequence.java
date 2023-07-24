class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max =1;
       for(int i=0;i<nums.length;i++)
       {
           int count=1;
           for(int j=i;j<nums.length-1;j++)
           {
                if(nums[j+1]>nums[j])
                {
                    count++;
                }  
               else
               break;
           }
           max=Math.max(max,count);
       }
        return max;
    }
}