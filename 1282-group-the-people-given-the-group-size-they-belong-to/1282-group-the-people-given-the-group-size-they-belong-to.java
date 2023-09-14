class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        int n = groupSizes.length;
        for(int i=0;i<n;i++)
        {
            int size = groupSizes[i];
            if(!map.containsKey(size))
            {
                map.put(size,new ArrayList<>());
            }
            map.get(size).add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> al: map.values())
        {
            int size = al.size();
            for(int i=0;i<size;i+=groupSizes[al.get(i)])
            {
                ans.add(al.subList(i,i+groupSizes[al.get(i)]));
            }
        }
        return ans;
    }
}