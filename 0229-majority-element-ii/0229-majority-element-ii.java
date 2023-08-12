class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Write your code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        int val = (int)Math.floor(nums.length/3);
        for(int key:map.keySet())
        {
            if(map.get(key)>val)
            {
                list.add(key);
            }
        }
        return list;
    }
}
    