class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char arr[] = s1.toCharArray();
        char arr1[] = s2.toCharArray();
        for(int i = arr.length-1;i>=0;)
        {
            if(arr[i]==arr1[i])
            {
                i--;
                continue;
            }
            else
            {
                if(i-2>=0)
                {
                    char temp = arr[i];
                    arr[i]=arr[i-2];
                    arr[i-2]=temp;
                    if(arr[i]==arr1[i])
                        continue;
                    else
                        return false;
                }
                else
                    return false;
                
            }
        }
        return true;
    }
}