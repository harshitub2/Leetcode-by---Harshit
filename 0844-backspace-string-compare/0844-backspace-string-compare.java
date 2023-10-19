class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                sb.append(s.charAt(i));
            }
            else if(sb.length()>0)
                sb.deleteCharAt(sb.length()-1);
            }
        
        
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='#')
            {
                tb.append(t.charAt(i));
            }
            else
            {
                if(tb.length()>0)
                tb.deleteCharAt(tb.length()-1);
            }
        }
        return sb.toString().equals(tb.toString());
    }
}