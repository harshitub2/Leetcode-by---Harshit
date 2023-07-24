class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        List<String> list = new ArrayList<>();
        String arr[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++)
        {
            String ans ="";
            for(int j=0;j<words[i].length();j++)
            {
                char c = words[i].charAt(j);
                int value = c-'a';
                ans += arr[value];
            }
            if(!list.contains(ans))
                list.add(ans);
            
        }
        return list.size();
    }
}