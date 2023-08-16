class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[] = new int[nums.length-k+1];
        Deque<Integer> queue = new LinkedList<>();
        int a=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(!queue.isEmpty() && queue.peek()==i-k)
            {
                queue.poll();
            }
            while(!queue.isEmpty() && nums[queue.peekLast()]<nums[i])
            {
                queue.pollLast();
            }
            queue.add(i);
            if(i>=k-1)
            {
                arr[a++]=nums[queue.peek()];
            }
           
        }
         return arr;
    }
}