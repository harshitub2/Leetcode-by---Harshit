class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        comb(al,temp,0,candidates,target);
        return al;
    }
    void comb(List<List<Integer>> res,List<Integer> list,int idx,int can[],int sum)
    {
        
        if(sum==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = idx;i<can.length;i++)
        {
        if(i>idx && can[i]==can[i-1])
            continue;
            
            if(sum-can[i]<0)
            {
                break;
            }
                list.add(can[i]);
                comb(res,list,i+1,can,sum-can[i]);
                list.remove(list.size()-1);
                
            
        }
    }
    
    
}