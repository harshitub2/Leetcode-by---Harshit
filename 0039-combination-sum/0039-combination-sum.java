class Solution {
    public void backTrack(List<List<Integer>> result,List<Integer> lst,int idx,int[] arr,int sum)
    {
        if(sum == 0)
        {
            result.add(new ArrayList<>(lst));
            return;
        }
        for(int i = idx;i<arr.length;i++)
        {
            if(sum - arr[i] >=0)
            {
                lst.add(arr[i]);
                backTrack(result,lst,i,arr,sum-arr[i]);
                lst.remove(lst.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTrack(result,temp,0,candidates,target);
        return result;
    }
}
