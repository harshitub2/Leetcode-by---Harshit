class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        dfs(s,list);
        return list;
    }
    void dfs(String s, List<Integer> list)
    {
        if(s.length()==0)
            return;
        int last = s.lastIndexOf(s.charAt(0));
        for(int i=1;i<last;i++)
        {
            if(s.lastIndexOf(s.charAt(i))<=last)
                continue;
            last = s.lastIndexOf(s.charAt(i)); 
        }
        list.add(last+1);
        s=s.substring(last+1);
        dfs(s,list);
    }
}