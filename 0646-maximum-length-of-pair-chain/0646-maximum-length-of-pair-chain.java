class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int count =1;
        int n = pairs.length;
        int check = pairs[0][1];
        for(int i=1;i<n;i++)
        {
            if(pairs[i][0]>check)
            {
                count++;
                check = pairs[i][1];
            }
        }
        return count;
    }
}