class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int sum;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int low = i+1;
            int high = nums.length-1;
            sum = 0-nums[i];
            if(i==0 || (i>0) && nums[i]!=nums[i-1])
            {
                while(low<high)
                {
                    
                    if(nums[low]+nums[high]==sum)
                    {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[low]);
                        list.add(nums[high]);
                        
                        ans.add(list);
                        while(low<high && nums[low]==nums[low+1])
                                low++;
                        while(low<high && nums[high]==nums[high-1])
                                high--;
                        low++;
                        high--;
                    }
                    else if(sum<nums[low]+nums[high]){
                        high--;
                    }
                    else
                        low++;
                        
                        
                    }
                }
            }
        
        return ans;
    }
}