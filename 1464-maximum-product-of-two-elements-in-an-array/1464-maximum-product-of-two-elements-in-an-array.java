/*class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int max2 =nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max2 = max;
                max = nums[i];
                
            }
            else if(nums[i]>max2 && nums[i]<=max)
            {
                max2 = nums[i];
            }
        }
       
        return (max-1)*(max2-1);
        
    }
}*/

class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length < 2) {
            // Handle the case when the array has less than two elements
            // You can return a default value or throw an exception
            return 0; // or throw new IllegalArgumentException("Array must have at least two elements");
        }

        int max = nums[0];
        int max2 = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max2 = max;
                max = nums[i];
            } else if (nums[i] > max2 && nums[i] <= max) {
                max2 = nums[i];
            }
        }

        return (max - 1) * (max2 - 1);
    }
}
