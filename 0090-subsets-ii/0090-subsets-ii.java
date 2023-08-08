class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        subset(nums,0,list,ans);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<ans.size();i++)
        {
            set.add(ans.get(i));
        }
        List<List<Integer>> val = new ArrayList<>(set);
        return val;
    }
    void subset(int nums[], int idx , List<Integer> list, List<List<Integer>> ans)
    {
        if(idx == nums.length)
        {
            ans.add(new ArrayList<>(list));
            
        }
        
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1])
                continue;
            list.add(nums[i]);
            subset(nums,i+1,list,ans);
            list.remove(list.size()-1);
            subset(nums,i+1,list,ans);
            }
    }
}