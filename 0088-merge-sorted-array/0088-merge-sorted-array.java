class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[n+m];
        int index =0;
        int i=0;
        int j=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[index]=nums1[i];
                i++;
                index++;
            }
            else
            {
                arr[index]=nums2[j];
                j++;
                index++;
            }
            
            }
        
        while(i<m)
        {
            arr[index]=nums1[i];
            i++;
            index++;
        }
        while(j<n)
        {
            arr[index]=nums2[j];
            j++;
            index++;
        }
        for(int k=0;k<arr.length;k++)
        {
            nums1[k]=arr[k];
        }
        
    }
}