class Solution {
    public boolean winnerOfGame(String colors) {
        int a =0;
        int b =0;
        int n = colors.length();
        for(int i=1;i<n-1;i++)
        {
            if(colors.charAt(i)=='A' && colors.charAt(i-1)=='A' && colors.charAt(i+1)=='A')
                a++;
            else if(colors.charAt(i)=='B' && colors.charAt(i-1)=='B' && colors.charAt(i+1)=='B')
                b++;
            
        }
        if(a<=b)
            return false;
        else 
            return true;
    }
}