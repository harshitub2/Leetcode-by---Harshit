class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> al = new ArrayList<>();
        int arr[] = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                al.add(i);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j:al)
            {
                min=Math.min(Math.abs(j-i),min);
            }
            arr[i]=min;
        }
        return arr;
    }
}