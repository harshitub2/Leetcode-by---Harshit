class Solution {
    public int[] buildArray(int[] nums) {
        int arr [] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
         int arr1 [] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr1[i] =nums[arr[i]] ;
        }
        return arr1;
    }
}