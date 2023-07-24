class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
              if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
              {
                  int first = stack.pop();
                  int second = stack.pop();
                  int val = calc(first,second,tokens[i]);
                  stack.push(val);
                  
              }
            else
                stack.push(Integer.parseInt(tokens[i]));
        }
        return stack.pop();
    }
    int calc(int first,int second, String token)
    {
        if(token.equals("+"))
            return second + first;
        else if(token.equals("-"))
            return second - first;
       else if(token.equals("*"))
            return second * first;
        else if(token.equals("/"))
            return second / first;
        return 0;
    }
}