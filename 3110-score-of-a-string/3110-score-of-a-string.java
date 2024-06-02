class Solution {
    public int scoreOfString(String s) {
        int sum =0;
        for(int i =0;i<s.length()-1;i++)
        {
            int value1 = s.charAt(i)-'a';
            int value2 = s.charAt(i+1)-'a';
            int ans1 = value1 + 97;
            int ans2 = value2 + 97;
            
            int su = Math.abs(ans1-ans2);
            sum+=su;
            
            
        }
        return sum;
    }
}