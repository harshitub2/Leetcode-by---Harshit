class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          // Write your code here.
        // Write your code here.
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subset(candidates,0,target,list,ans);
        return ans;
    }
    static void subset(int arr[],int idx, int k, List<Integer> list, List<List<Integer>> ans)
    {
        if(k==0)
        {
                ans.add(new ArrayList<>(list));
                return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            if(i>idx && arr[i]==arr[i-1])
                continue;
            if(arr[i]>k)
                break;
            list.add(arr[i]);
            subset(arr,i+1,k-arr[i],list,ans);
            list.remove(list.size()-1);
            
        }

    }
}