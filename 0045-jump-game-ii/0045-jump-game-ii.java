class Solution {
    public int jump(int[] nums) {
      int left =0;
        int right =0;
        int count=0;
        
        while(right<nums.length-1)
        {
            int jumpSoFar=0;
            for(int i=left;i<right+1;i++)
            {
            jumpSoFar=Math.max(jumpSoFar,i+nums[i]);        
            }
            left = right+1;
            right = jumpSoFar;
            count+=1;
        }
        return count;
    }
}