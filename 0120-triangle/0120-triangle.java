class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0)
            return 0;
        if(triangle.size()==1)
            return triangle.get(0).get(0);
        int dp[] = new int[triangle.size()];
        dp[0]=triangle.get(0).get(0);
        return min(triangle,dp,1);
        
    }
    
    int min(List<List<Integer>> triangle,int dp[], int idx)
    {
        int pre = dp[0];
        int temp;
        List<Integer> list = triangle.get(idx);
            dp[0]+=list.get(0);
        
        for(int i=1;i<idx;i++)
        {
            temp = dp[i];
            dp[i]=list.get(i)+Math.min(pre,dp[i]);
            pre=temp;
        }
        
        dp[idx]= pre + list.get(idx);
        
        if((idx+1) == triangle.size())
        {
            int res = dp[0];
            for(int i=1;i<=idx;i++)
            {
            
            res = Math.min(res,dp[i]);
               
            }
             return res;
        }
        return min(triangle,dp,idx+1);
        
    }
}