class Solution {
    public int[] countBits(int n) {
        String arr[] = new String[n+1];
        int ans[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            arr[i]=Integer.toBinaryString(i);
            
        }
        for(int i=0;i<arr.length;i++)
        {
            int count =0;
            for(int j=0;j<arr[i].length();j++)
            {
                if(arr[i].charAt(j)=='1')
                {
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}