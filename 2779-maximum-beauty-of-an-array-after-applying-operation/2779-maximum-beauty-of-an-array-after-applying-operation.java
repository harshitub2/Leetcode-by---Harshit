class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int l =0,r=0,max=1;
        
        while(l<=r && r<nums.length)
        {
            if(nums[r]-nums[l]<=2*k)
            {
               
                max=Math.max(r-l+1,max);
                r++;
                continue;
            }
            l++;
        }
        return max;
    }
}