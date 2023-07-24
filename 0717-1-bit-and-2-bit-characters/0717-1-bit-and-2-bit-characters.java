class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        for(int i=0;i<bits.length;)
        {
            if(bits[i]==0 && i==bits.length-1)
            {
                return true;
            }
            else if(bits[i]==1)
            {
                i+=2;
            }
            else
            {
                i++;
            }

        }
    return false;
    }
}