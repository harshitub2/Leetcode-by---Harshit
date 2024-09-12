class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       List<Character> list = new ArrayList<>();
        int count =0;
        for(int i =0;i<allowed.length();i++)
        {
            if(!list.contains(allowed.charAt(i)))
                list.add(allowed.charAt(i));
            
        }
        int check = -1;
        for(int i =0;i<words.length;i++)
        {
            for(int j =0;j<words[i].length();j++)
            {
                  if(list.contains(words[i].charAt(j)))
                     {
                         check =1;
                     continue;
                     }
                     else
                     {
                         check = -1;
                            break;
                     }
            }
                     if(check==1)
                     count++;
                     
        }
                     return count;
    }
}