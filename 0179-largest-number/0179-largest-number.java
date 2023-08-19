class Solution {
    public String largestNumber(int[] nums) {
        String s[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }
        String ans = "";
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        for(String str:s)
        {
            ans+=str;
        }
       return ans.charAt(0)!='0'?ans:"0";
    }
}