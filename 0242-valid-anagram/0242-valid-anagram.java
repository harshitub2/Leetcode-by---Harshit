class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        if(s.length()!=t.length())
            return false;
        
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            if(!map.containsKey(t.charAt(i)) ||  map.get(t.charAt(i))==0)
            {
                return false;
            }
            map.put(t.charAt(i),map.get(t.charAt(i))-1);
        }
        
       
        return true;
        
    }
}