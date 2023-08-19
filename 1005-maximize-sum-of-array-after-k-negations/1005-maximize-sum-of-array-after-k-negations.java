

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0;

        // Negate negative numbers while there are still negative numbers and k > 0
        while (k > 0 && i < nums.length && nums[i] < 0) {
            nums[i] = -nums[i];
            k--;
            i++;
        }

        // If k is still > 0 and it's odd, we will negate the smallest remaining element
        if (k > 0 && k % 2 == 1) {
            Arrays.sort(nums); // Sort again to make sure the smallest element is at the beginning
            nums[0] = -nums[0];
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}





