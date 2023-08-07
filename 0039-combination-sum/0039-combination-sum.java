class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int sum =0;
        comb(candidates,target,0,candidates.length,ans,list,sum);
        return ans;
    }
    void comb(int candidates[], int target,int idx,int n, List<List<Integer>> ans, List<Integer> list,int sum)
    {
        if(idx==n)
        {
        if(target==sum)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        return;
        }
        else if(sum>target)
            return;
        list.add(candidates[idx]);
        comb(candidates,target,idx,n,ans,list,sum+candidates[idx]);
        list.remove(list.size()-1);
        comb(candidates,target,idx+1,n,ans,list,sum);
        
    }
}