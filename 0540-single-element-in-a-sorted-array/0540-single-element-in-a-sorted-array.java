class Solution {
    public int singleNonDuplicate(int[] nums) {
      /*   Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet())
        {
            if(map.get(key)==1)
            return key;
        }
       
     return -1;*/
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
           if(set.contains(nums[i]))
           {
               set.remove(nums[i]);
           }
            else
                set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        return list.get(0);
        
    }
}