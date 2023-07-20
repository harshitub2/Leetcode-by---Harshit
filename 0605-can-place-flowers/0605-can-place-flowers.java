class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
            int count =0;
        if(m==1 && flowerbed[0]==0)
           {
               return true;
           }
        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            flowerbed[0]=1;
            count++;
        }
        
        for(int i=1;i<m-1;i++)
        {
                if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
                {
                    flowerbed[i]=1;
                    count++;
                }
        }
        if(m-2>0 && flowerbed[m-1]==0 && flowerbed[m-2]==0)
        {
            flowerbed[m-1]=1;
            count++;
        }
        return count>=n;
    }
}