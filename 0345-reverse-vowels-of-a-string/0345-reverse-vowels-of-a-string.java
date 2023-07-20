class Solution {
    public String reverseVowels(String s) {
    List<Character> al = new ArrayList<>();
        char arr[] = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
            {
                al.add(c);
            }
        }
        for(int i=0;i<s.length();i++)
        {
              char c = s.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
        {
                arr[i]=al.remove(al.size()-1);
        }
        }
        String str = new String(arr);
       return str;
    }
}