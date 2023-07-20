class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans ="";
        int n = word1.length();
        int m = word2.length();
        int j=0;
        int k=0;
       for(int i=0;i<m+n;i++)
       {
       if(i%2==0 && j<n)
       {
            ans=ans + word1.charAt(j);
               j++;
           
        }
        else if(i%2!=0 && k<m)
        {
             ans=ans+word2.charAt(k);
                k++;

        }
           else if(i%2==0 && k<m)
           {
               ans=ans+word2.charAt(k);
               k++;
           }
           else if(i%2!=0 && j<n)
           {
               ans=ans+word1.charAt(j);
               j++;
           }
           
       }
        
        return ans;
            
        
    }
}