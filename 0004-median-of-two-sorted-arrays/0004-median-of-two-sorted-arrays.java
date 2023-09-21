class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
       double temp[] = new double[m+n];
        
        int i =0;
        int j=0;
        int index =0;
        while(i<n && j<m)
        {
            if(nums1[i]<=nums2[j])
            {
                temp[index]=nums1[i];
                i++;
                index++;
            }
            else
            {
                temp[index]=nums2[j];
                j++;
                index++;
            }
        }
        while(i<n)
        {
             temp[index]=nums1[i];
                i++;
                index++;
        }
        while(j<m)
        {
            temp[index]=nums2[j];
                j++;
                index++;
        }
        int k = temp.length;
        if(k%2!=0)
        {
            int ind = 0+((k-1)/2);
            return temp[ind];
        }
        else
        {
            int ind = 0+((k-1)/2);
            double ans = (temp[ind+1]+temp[ind])/2;
            return ans;
        }
            
    }
}