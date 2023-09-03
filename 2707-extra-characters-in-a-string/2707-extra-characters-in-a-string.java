class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int dp[] = new int[51];
        int n = s.length();
        for(int i=n-1;i>=0;i--)
        {
            dp[i]=1+dp[i+1];
            for(String wrd:dictionary)
            {
                if(i+wrd.length()<=n && s.substring(i,i+wrd.length()).equals(wrd))
                {
                    dp[i]=Math.min(dp[i],dp[i+wrd.length()]);
                }
            }
        }
        return dp[0];
    }
}