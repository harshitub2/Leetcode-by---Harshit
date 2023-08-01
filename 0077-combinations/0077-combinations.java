class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        com(n,k,1,al,list);
        return al;
    }
    void com(int n , int k, int idx, List<List<Integer>> al,List<Integer> list)
    {
        if(list.size()==k)
        {
            al.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<=n;i++)
        {
            list.add(i);
            com(n,k,i+1,al,list);
            list.remove(list.size()-1);
        }
        
        
    }
}