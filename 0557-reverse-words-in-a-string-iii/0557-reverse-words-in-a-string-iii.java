class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            int m = arr[i].length();
            for(int j = m-1;j>=0;j--)
            {
                sb.append(arr[i].charAt(j));
            }
            if(i!=n-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}