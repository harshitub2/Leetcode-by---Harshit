class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> map = new HashMap<>();
       
        
        for(int i=0;i<strs.length;i++)
        {
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String put = new String(arr);
            if(map.containsKey(put))
            {
                map.get(put).add(strs[i]);
            }
            else
            {
                List<String> al = new ArrayList<>();
                al.add(strs[i]);
                map.put(put,al);
            }
        }
       return new ArrayList<>(map.values());
    }
}