class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> al = new ArrayList<>();
        int j = 0;
        for(int i=1;i<=n && j<target.length;i++)
        {
            al.add("Push");
            if(target[j]==i)
            {
                j++;
            }
            else
            {
                al.add("Pop");
            }
        }
        return al;
    }
}