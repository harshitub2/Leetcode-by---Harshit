class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())
            return false;
        int m = t.length();
        int n = s.length();
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0)
        {
            if(t.charAt(i)==s.charAt(j))
            {
                i--;
                j--;
            }
            else
            {
                i--;
            }
        }
        if(j<0)
            return true;
        else 
            return false;
    }
}