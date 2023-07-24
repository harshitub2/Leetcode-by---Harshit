class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int temp = Integer.MAX_VALUE;
        int closeness = 0;
        int ans =0;
        int sum =0;
        for(int i=0;i<nums.length-2;i++)
        {
            int left = i+1;
            int right = nums.length-1;
            while(left<right)
            {
                sum = nums[i]+nums[left]+nums[right];
                if(sum<target)
                {
                   closeness=target-sum;
                }
                else if(target<sum)
                closeness=sum-target;
                else
                    return sum;
                if(closeness<temp)
                {
                    ans=sum;
                    temp=closeness;
                }
            if(sum<target)
                left++;
                else
                    right--;
            }
        }
        return ans;
            
    }
}