class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums,0,n-1);
    }
    int mergeSort(int nums[], int low, int high)
    {
        int count =0;
        if(low>=high)
            return count;
        int mid = (low + high)/2;
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=countPair(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }
    int countPair(int nums[], int low, int mid, int high)
    {
        int count =0;
        int left = low;
        int right = mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && nums[i]>2l*nums[right])
                right++;
            count+=right-(mid+1);
        }
        return count;
    }
    void merge(int nums[], int low, int mid, int high)
    {
        int left = low;
        int right = mid+1;
        List<Integer> al = new ArrayList<>();
        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
                al.add(nums[left]);
                left++;
            }
            else
            {
                al.add(nums[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            al.add(nums[left]);
            left++;
        }
        while(right<=high)
        {
            al.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            nums[i]=al.get(i-low);
        }
        
    }
}