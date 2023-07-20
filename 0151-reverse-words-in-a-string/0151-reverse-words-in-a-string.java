/*class Solution {
    public String reverseWords(String s) {
        String str=s.trim();
        String arr[] = str.split(" ");
        
        String ans ="";
        for(int i=arr.length-1;i>0;i--)
        {
            if(!arr[i].equals(" "))
            {
            ans+=arr[i] + " ";
            }
        }
        
            return ans=ans+arr[0];
    }
}*/
class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] arr = str.split(" ");

        String ans = "";
        for (int i = arr.length - 1; i > 0; i--) {
            if (!arr[i].equals("")) {
                ans += arr[i] + " ";
            }
        }

        return ans = ans + arr[0];
    }
}