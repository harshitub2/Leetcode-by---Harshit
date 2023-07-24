class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean dp[] = new boolean[n+1];
        dp[n]=true;
        for(int i=n-1;i>=0;i--)
        {
            for(String wrd:wordDict)
            {
                if(i+wrd.length()<=n && wrd.equals(s.substring(i,i+wrd.length())))
                     {
                    dp[i]=dp[i+wrd.length()]; 
                     }
                if(dp[i])
                    break;
            }
        }
        return dp[0];
    }
}