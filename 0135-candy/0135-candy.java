class Solution {
    public int candy(int[] ratings) {
    int candy[] = new int[ratings.length];
        
        candy[0]=1;
        for(int i=1;i<candy.length;i++)
        {
        if(ratings[i]>ratings[i-1])
        {
            candy[i]=candy[i-1]+1;
        }
            else
                candy[i]=1;
        }
        
        int res =candy[candy.length-1];
        
        for(int i=candy.length-2;i>=0;i--)
        {
            int curr =1;
        if(ratings[i]>ratings[i+1])     
        {
            curr = candy[i+1]+1;
        }
            res+=Math.max(candy[i],curr);
            candy[i]=curr;
        }
        return res;
    }
}