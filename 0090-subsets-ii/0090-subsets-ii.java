class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subset(0,nums,list,ans);
         return ans;
        
    }
    void subset(int idx, int nums[], List<Integer> list,List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(list));
        
        for(int i=idx;i<nums.length;i++)
        {
            if(i!=idx && nums[i]==nums[i-1])
                continue;
            list.add(nums[i]);
            subset(i+1,nums,list,ans);
            list.remove(list.size()-1);
            
        }
       
    }
}