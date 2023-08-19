class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int arr[] = new int[3];
        
        
            for(int i=0;i<n;i++)
            {
            if(bills[i]-5==0)
            {
                
                arr[0]++;
                
            }
            else if(bills[i]-5==5)
            {
                arr[1]++;
                if(arr[0]<1)
                {
                    return false;
                }
                else
                {
                arr[0]--;
                    
                }
            }
                else if(bills[i]-5==15)
                {
                    if(arr[1]>0)
                    {
                        arr[1]--;
                        if(arr[0]>0)
                        {
                            arr[0]--;
                            continue;
                        }
                        else 
                            return false;
                    }
                    else
                    {
                        if(arr[0]<3)
                        {
                            return false;
                        }
                        else
                        {
                            arr[0]=arr[0]-3;
                        }
                    }
                    
                }
            }
        return true;
    }
}