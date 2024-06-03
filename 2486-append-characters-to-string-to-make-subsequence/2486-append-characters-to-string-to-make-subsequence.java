class Solution {
    public int appendCharacters(String s, String t) {
    int sLen = s.length();
    int tLen = t.length();
        int i = 0;
        int j = 0;
        while(i<sLen && j<tLen)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else if(s.charAt(i)!=t.charAt(j))
            {
                i++;
            }
        }
        return tLen-j;
    }
}