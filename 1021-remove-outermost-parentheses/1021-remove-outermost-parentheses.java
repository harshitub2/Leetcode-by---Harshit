class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        List<String> list = new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)=='(')
            {
                stack.push(')');
            }
            else if(s.charAt(i)==')')
            {
                
                stack.pop();
            }
            if(stack.isEmpty())
            {
                list.add(s.substring(0,i+1));
                s=s.substring(i+1,s.length());
                i=-1;
            }   
           
        }
        String ans ="";
        for(String word:list)
        {
            ans+=word.substring(1,word.length()-1);
        }
        
       
        return ans;
    }
}