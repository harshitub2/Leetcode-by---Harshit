class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod[] = new int[nums.length];
        prod[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            prod[i]=nums[i-1]*prod[i-1];
        }
        int product=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            prod[i]=prod[i]*product;
            product*=nums[i];
        }
       
        
        return prod;
    }
}
