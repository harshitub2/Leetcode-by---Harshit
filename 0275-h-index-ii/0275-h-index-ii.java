class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=citations.length-1;i>=0;i--)
        {
            map.put(citations[i],n-i);
        }
        int ans = Integer.MIN_VALUE;
        for(int key:map.keySet())
        {
             ans=Math.max(ans,Math.min(key,map.get(key)));
        }
        
        return ans;
    }
}