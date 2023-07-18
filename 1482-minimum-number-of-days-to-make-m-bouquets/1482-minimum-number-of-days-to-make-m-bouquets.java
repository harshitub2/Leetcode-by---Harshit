class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(long)m*k)
            return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
                 min=Math.min(min,bloomDay[i]);
                max=Math.max(max,bloomDay[i]);
        }
        int start = min;
        int end = max;
        
        while(start<end)
        {
            int mid=start+(end-start)/2;
        
        int value = count(bloomDay,k,mid);
        if(value<m)
        {
            start=mid+1;
        }
        else
        {
            end=mid;
        }
            
        }
        return start;
    }
    int count(int[] bloomDay,int k,int day){
        int b=0;
        int curr=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]>day)
            {
            curr=0;    
            }
            else
            {
                curr++;
                if(curr==k)
                {
                    curr=0;
                    b++;
                    
                }
            }
        }
        return b;
    }
    
}