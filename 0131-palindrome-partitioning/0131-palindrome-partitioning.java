class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        par(s,0,list,ans);
        return ans;
    }
    void par(String s, int idx, List<String> list , List<List<String>> ans)
    {
        if(idx==s.length())
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=idx;i<s.length();i++)
        {
            if(palindrome(s,idx,i))
            {
                list.add(s.substring(idx,i+1));
                par(s,i+1,list,ans);
                list.remove(list.size()-1);
            }
        }
        
    }
    boolean palindrome(String s , int start, int end)
    {
        while(start<=end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
}