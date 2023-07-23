class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> al = new ArrayList<>();
       for(String word:words)
       {
           List<String> list = split(word,separator);
           for(String wrd:list)
           {
               al.add(wrd);
           }
           
       }
        return al;
    }
    List<String> split(String word, char separator)
    {
        String ans ="";
        List<String> bl = new ArrayList<>();
        for(int i=0;i<word.length();i++)
        {
        if(word.charAt(i)!=separator)
        {
            ans+=word.charAt(i);
        }
            else if(ans.length()>0)
            {
                bl.add(ans);
                ans="";
            }
        }
        if(ans.length()>0)
        {
            bl.add(ans);
        }
        return bl;
    }
}