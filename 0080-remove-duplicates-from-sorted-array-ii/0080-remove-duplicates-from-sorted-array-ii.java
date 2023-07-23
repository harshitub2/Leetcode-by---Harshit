class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++)
        {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);    
        }
        int i=0;
        for(int key:map.keySet())
        {
            nums[i]=key;
            if(map.get(key)<2)
                i++;
            else
            {
                nums[i+1]=key;
                i+=2;
            }
                
        }
        return i;
    }
}