class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int val = (int)Math.floor(nums.length/3);
        List<Integer> al = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num :map.keySet())
        {
            if(map.get(num)>val)
            {
                al.add(num);
            }
        }
        return al;
    }
}