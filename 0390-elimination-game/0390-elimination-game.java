class Solution {
    public int lastRemaining(int n) {
        boolean left = true;
        int rem = n;
        int step =1;
        int head = 1;
        while(rem>1)
        {
            if(left==true || rem%2==1)
            {
                head=head+step;
            }
            rem/=2;
            step*=2;
            left=!left;
        }
        return head;
        
    }
}