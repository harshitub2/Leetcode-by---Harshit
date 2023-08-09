class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(p==0)
            return 0;
        int n = nums.length;
        Arrays.sort(nums);
        int start =0;
        int end = nums[n-1]-nums[0];
        int ans = end;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(pair(nums,mid,p))
            {
                ans = mid;
                end = mid -1;
            }
            else
                start = mid+1;
        }
        return ans;
    }
    boolean pair(int nums[],int mid, int p)
    {
        int count =0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]<=mid)
            {
                count++;
                i++;
            }
            if(count==p)
                return true;
        }
        return false;
    }
}