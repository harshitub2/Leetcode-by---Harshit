class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combination(res,temp,0,candidates,target);
        return res;
    }
    void combination(List<List<Integer>> res, List<Integer> list, int idx, int can[], int sum)
    {
        
        if(sum==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<can.length;i++)
        {
            if(sum-can[i]>=0)
            {
                list.add(can[i]);
                combination(res,list,i,can,sum-can[i]);
                list.remove(list.size()-1);
            }        
        }
        
        }
    
    }
    
