class Solution {
    public int firstUniqChar(String s) {
        List<Character> al = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            char c = s.charAt(i);
            if(!al.contains(c))
            {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(j)==c)
                {
                    count++;
                }
            }
            }
            al.add(c);
            if(count==1)
                return i;
        }
        return -1;
    }
}