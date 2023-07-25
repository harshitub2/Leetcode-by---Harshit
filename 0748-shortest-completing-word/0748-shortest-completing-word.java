class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int ch[] = new int[26];
        for(char c:licensePlate.toCharArray())
        {
            if(c>='a' && c<='z')
            {
                ch[c-'a']++;
            }
            else if(c>='A' && c<='Z')
            {
                ch[c-'A']++;
            }
        }
        int min=Integer.MAX_VALUE;
        String ans ="";
        for(String word:words)
        {
            if(word.length()<min && com(word,ch))
            {
                ans=word;
                min=word.length();
            }
            
        }
        return ans;
    }
        
        boolean com(String word, int ch[])
        {
            int c[] = new int[26];
            for(int i=0;i<word.length();i++)
            {
                c[word.charAt(i)-'a']++;
            }
            
            for(int i=0;i<c.length;i++)
            {
                if(c[i]<ch[i])
                    return false;
            }
            return true;
        }
        
    
}