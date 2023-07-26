class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char arr[] = jewels.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int count =0;
        for(int i=0;i<stones.length();i++)
        {
            if(set.contains(stones.charAt(i)))
                count++;
        }
        return count;
    }
}