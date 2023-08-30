class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int count =0;
            for(int j=0;j<points.length;j++)
            {
                int xDiff = Math.abs(queries[i][0]-points[j][0]);
                int yDiff = Math.abs(queries[i][1]-points[j][1]);
                int val = (int)(Math.ceil(Math.sqrt((xDiff*xDiff) + (yDiff*yDiff))));
                
                if(val<=queries[i][2])
                    count++;
            }
              ans[i]=count;
        }
      
        return ans;
    }
}