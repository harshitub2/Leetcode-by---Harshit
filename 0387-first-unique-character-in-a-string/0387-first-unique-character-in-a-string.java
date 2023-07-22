class Solution {
    public int firstUniqChar(String s) {
     /*   List<Character> al = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            char c = s.charAt(i);
            if(!al.contains(c))
            {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(j)==c)
                {
                    count++;
                }
            }
            }
            al.add(c);
            if(count==1)
                return i;
        }
        return -1;*/
        //int unique = -1;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
        map.put(s.charAt(i),map.get(s.charAt(i))+1);        
             }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }
}