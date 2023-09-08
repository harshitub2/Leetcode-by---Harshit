class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> al = new ArrayList<>();
        int arr[] = new int[numRows];
        for(int i=0;i<numRows;i++)
        {
            int temp[] = new int[numRows];
            temp[0]=1;
            temp[i]=1;
            for(int j=1;j<i;j++)
            {
                temp[j]=arr[j]+arr[j-1];
            }
            List<Integer> bl = new ArrayList<>();
            for(int k=0;k<i+1;k++)
            {
                
                bl.add(temp[k]);
            }
            al.add(bl);
            arr=temp;
        }
        return al;
    }
}