class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(i1,i2)->(i1[0]-i2[0]));
        
        int[] newinterval = intervals[0];
        List<int[]> list = new ArrayList<>();
        list.add(newinterval);
        for(int [] interval:intervals)
        {
            if(interval[0]<=newinterval[1])
            {
                newinterval[1]=Math.max(interval[1],newinterval[1]);
            }
            else
            {
                newinterval = interval;
                list.add(newinterval);
            }
        }
        int arr[][] = new int[list.size()][2];
       for(int i=0;i<list.size();i++)
       {
       for(int j=0;j<2;j++)
       {
           arr[i][j]=list.get(i)[j];
       }
       }
        return arr;
    }
}