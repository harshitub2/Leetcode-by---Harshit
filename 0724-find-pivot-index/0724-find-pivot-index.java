class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int sumr =0;
            int suml=0;
        for(int j=i+1;j<nums.length;j++)
        {
            sumr+=nums[j];
        }   
            for(int k=0;k<i;k++)
            {
                suml+=nums[k];
            }
            if(suml==sumr)
                return i;
        }
        return -1;
    }
}