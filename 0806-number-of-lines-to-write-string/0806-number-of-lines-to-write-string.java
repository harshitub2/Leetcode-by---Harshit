class Solution {
    public int[] numberOfLines(int[] widths, String s) {
       int res[] = new int[2];
        int sum =100;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(sum-widths[c-'a']>=0)
            {
            sum-=widths[c-'a'];
            }
            else
            {
                sum=100;
                count++;
                i=i-1;
                
            }
        }
        res[0]=count+1;
        res[1]=100-sum;
        return res;
    }
}