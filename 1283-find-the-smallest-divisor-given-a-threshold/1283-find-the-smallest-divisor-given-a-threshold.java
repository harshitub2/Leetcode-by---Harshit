class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max =0;
        for(int i=0;i<n;i++)
        {
        max=Math.max(nums[i],max);        
        }
        int low =1;
        int high = max;
        
        if(n==threshold)
            return max;
        int speed = Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(isPossible(nums,mid,threshold))
            {
                speed=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            
            
        }
        return speed;
    }
    boolean isPossible(int[] nums,int mid, int threshold)
    {
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=Math.ceil((nums[i]*1.0)/mid);
        }
        return sum<=threshold;
    
}
}