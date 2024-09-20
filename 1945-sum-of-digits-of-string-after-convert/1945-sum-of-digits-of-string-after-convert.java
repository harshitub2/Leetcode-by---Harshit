class Solution {
    public int getLucky(String s, int k) {
        
      StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            sb.append(ch-'a'+1);
            
        }
        int res = 0;
        String word = sb.toString();
        for(int i =0;i<k;i++)
        {
            res =0;
            for(char digit: word.toCharArray())
            {
            res+=digit-'0';            
            
            }
            word = Integer.toString(res);
        }
        return res;
    }}
        