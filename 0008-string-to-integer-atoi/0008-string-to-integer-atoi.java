class Solution {
    public int myAtoi(String s) {
        int res =0;
        int sign =1;
        int i=0;    
        
        
  String t = s.trim();
        if(t.length()==0)
            return res;
        
        if(i<t.length() && t.charAt(i)=='+' || t.charAt(i)=='-')
            sign=(t.charAt(i++)=='+')?1:-1;
        
        while(i<t.length() && Character.isDigit(t.charAt(i)))
        {
            int digit = t.charAt(i)-'0';
            
            if(res>Integer.MAX_VALUE/10 || res==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)
            {
                if(sign==1)
                return Integer.MAX_VALUE;
                else
                return Integer.MIN_VALUE;
                
            }
            res=res*10+digit;
            i++;
        }
        return res*sign;
    }
}
