class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Boolean> map1 = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
               {
                   if(map.get(s.charAt(i))!=t.charAt(i))
                       return false;
               }
               else
               {
                   if(map1.containsKey(t.charAt(i)))
                       return false;
                   else
                       map.put(s.charAt(i),t.charAt(i));
                   map1.put(t.charAt(i),true);
                   
               }
        }
               return true;
        
    }
}