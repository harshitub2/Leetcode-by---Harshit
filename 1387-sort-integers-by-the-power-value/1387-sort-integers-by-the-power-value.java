class Solution {
    public int getKth(int lo, int hi, int k) {
        int arr[][] = new int[hi-lo+1][2];
        for(int i = lo;i<=hi;i++)
        {
            int j =i;
            int l =i;
            int count =0;
            while(l!=1)
            {
                if(l%2==0)
                {
                    l=l/2;
                    count++;
                }
                else
                {
                    l=3*l+1;
                    count++;
                }
            }
            arr[j-lo][0]=j;
            arr[j-lo][1]=count;
        }
        Arrays.sort(arr,(a,b)->
                    {
                        if(a[1]!=b[1])
                        {
                            return a[1]-b[1];
                        }
                        else
                        {
                            return a[0]-b[0];
                        }
                    });
        return arr[k-1][0];
    }
}