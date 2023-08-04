class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int count =1;
      /*  for(int i = nums.length-1;i>=0;i--)
        {
            if(count==k)
            {
                return nums[i];
            }
                count++;
        }*/
        return nums[nums.length-k];
    }
}