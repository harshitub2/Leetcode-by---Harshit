class Solution {
    public String countAndSay(int n) {
            
        StringBuilder sb = new StringBuilder();
        if(n==1)
            return "1";
      String temp = countAndSay(n-1);
        int count =1;
        for(int i=0;i<temp.length();i++)
        {
            
            if(i+1<temp.length() && temp.charAt(i)==temp.charAt(i+1))
                count++;
            else
            {
                sb.append(count);
                sb.append(temp.charAt(i));
                count=1;
            }
        }
        return sb.toString();
        
            
    }
}