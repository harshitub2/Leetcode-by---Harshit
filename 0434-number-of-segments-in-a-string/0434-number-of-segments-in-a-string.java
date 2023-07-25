class Solution {
    public int countSegments(String s) {
        String arr[] = s.split(" ");
        int count =0;
        for(String str:arr)
        {
            if(!str.isEmpty())
            {
                count++;
            }
        }
        return count;
    }
}