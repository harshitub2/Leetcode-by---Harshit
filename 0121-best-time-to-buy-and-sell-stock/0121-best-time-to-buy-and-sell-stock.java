class Solution {
    public int maxProfit(int[] prices) {
        // Write your code here.
        int min = prices[0];
        int ans =0;
        int max =0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<min)
            min=prices[i];
            else
            {
                max=prices[i]-min;
                ans=Math.max(ans,max);
            }


        }
        return ans;
    }
}