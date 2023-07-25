class Solution {
    public String removeDuplicateLetters(String s) {
        char arr[] = s.toCharArray();
        int count[] = new int[26];
        boolean vis[] = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]-'a']--;
            
            if(vis[arr[i]-'a'])
                continue;
            
            while(!stack.isEmpty() && stack.peek()>arr[i] && count[stack.peek()-'a']>0)
            {
                vis[stack.peek()-'a']=false;
                stack.pop();
            }
            
                stack.push(arr[i]);
                vis[arr[i]-'a']=true;
        }
        
        StringBuilder sb = new StringBuilder();
        String ans ="";
        int size = stack.size();
        for(int i=0;i<size;i++)
        {
            ans = stack.pop()+ans;
        }
        return ans;
    }
}