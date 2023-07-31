class Solution {
    public int maxProduct(int[] nums) {
        int left = nums[0];
        int right = nums[0];
        int pro = 1;
        boolean zero = false;
        for(int i:nums)
        {
            pro*=i;
            if(i==0)
            {
                pro=1;
                zero =true;
                continue;
            }
            left=Math.max(left,pro);
        }
        pro =1;
        for(int i=nums.length-1;i>=0;i--)
        {
            pro=pro*nums[i];
            if(nums[i]==0)
            {
                zero= true;
                pro=1;
                continue;
            }
            right = Math.max(right,pro);
        }
        if(zero)
            return Math.max(Math.max(left,right),0);
        else
            return Math.max(left,right);
    }
}