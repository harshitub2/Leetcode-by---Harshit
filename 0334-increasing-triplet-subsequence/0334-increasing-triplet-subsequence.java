class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int firstm = Integer.MAX_VALUE;
        int secondm = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=firstm){
                firstm = nums[i];
            }
           else if(nums[i]<=secondm){
                secondm = nums[i];
            }
            else
            {
                return true;
            }
    }
     return false;   
    }
}
    