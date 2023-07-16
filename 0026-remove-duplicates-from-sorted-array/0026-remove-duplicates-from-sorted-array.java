class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        List<Integer> al = new ArrayList<>(set);
       for(int i=0;i<set.size();i++)
        {
            nums[i]=al.get(i);
        }
        return set.size();
    }
}