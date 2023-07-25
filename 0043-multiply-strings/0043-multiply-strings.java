class Solution {
    public String multiply(String num1, String num2) {
            int n = num1.length();
            int m = num2.length();
        
        int res [] = new int[n+m];
        
        for(int i=n-1;i>=0;i--)
        {
            int nu1 = num1.charAt(i)-'0';
            for(int j=m-1;j>=0;j--)
            { 
                int nu2 = num2.charAt(j)-'0';
                int product = nu1*nu2 + res[i+j+1];
                
                res[i+j+1]=product%10;
                res[i+j]+=product/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<res.length;i++)
        {
            sb.append(res[i]);
        }
        while(sb.length()>0 && sb.charAt(0)=='0')
        {
            sb.deleteCharAt(0);
        }
        return sb.length()>0?sb.toString():"0";
    }
    
}