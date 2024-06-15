class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));        
            }
            else
            {
                set.remove(s.charAt(i));
                length+=2;
            }
        }
        if(set.size()>0)
            length++;
        return length;
       
        
    }
}