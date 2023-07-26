class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        pair(n,1,0,"(",list);
        return list;
    }
        void pair(int n,int open, int close, String curr,List<String> list)
    {
        if(curr.length()==2*n)
        {
            
            list.add(curr);
            return;
        }
        if(open<n)
        {
            pair(n,open+1,close,curr+"(",list);
        }
        if(close<open)
        {
            pair(n,open,close+1,curr+")",list);
        }
    }
    
}