class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0 && nums2.length==0)
            return 0;
        
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];
        for(int i=0;i<m;i++)
        {
            arr[i]=nums1[i];
        }
        for(int i=m;i<m+n;i++)
        {
            arr[i]=nums2[i-m];
        }
        Arrays.sort(arr);
        if(arr.length%2==0)
        {
            double ans = (double)(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
            return ans;
        }

        return (double)arr[arr.length/2];

    }
}