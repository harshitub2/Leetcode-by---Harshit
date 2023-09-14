class Solution {
    public int minDeletions(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
     for(int i =0;i<n;i++)
     {
         map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
     }
        List<Integer> al = new ArrayList<>();
        int count =0;
        for(int values:map.values())
        { 
            if(!al.contains(values))
            {
                al.add(values);
            }
            else
            {
                while(al.contains(values) && values>0)
                {
                    count++;
                    values--;
                }
                al.add(values);
            }
        }
        return count;
    }
}