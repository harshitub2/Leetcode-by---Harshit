class Solution {
    public long minimumReplacement(int[] nums) {
        int n = nums.length;
        long num = 1000000000;
        long res =0;
        for(int i = n-1;i>=0;i--)
        {
           long  k = (num + nums[i]- 1  )/num;
            num = nums[i]/k;
            res+=k-1;
        }
        return res;
    }
}