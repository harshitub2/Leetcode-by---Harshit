class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n][m];
        for(int rows[]:dp)
        Arrays.fill(rows,-1);
        return longest(n-1,m-1,text1,text2,dp);
        
    }
    int longest(int idx1,int idx2 , String text1,String text2, int dp[][])
    {
        if(idx1<0||idx2<0)
            return 0;
        if(dp[idx1][idx2]!=-1)
        return dp[idx1][idx2];
        if(text1.charAt(idx1)==text2.charAt(idx2))
        {
            return dp[idx1][idx2] = 1 + longest(idx1-1,idx2-1,text1,text2,dp);
        }
        else
            return dp[idx1][idx2]= 0 + Math.max(longest(idx1,idx2-1,text1,text2,dp),longest(idx1-1,idx2,text1,text2,dp));
    }
}