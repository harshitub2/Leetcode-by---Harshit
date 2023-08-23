class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int maxFreq =0;
        char max = '-';
        for(char key:map.keySet())
        {
            if(map.get(key)>maxFreq)
            {
                maxFreq=map.get(key);
                max=key;
            }
        }
        if(maxFreq>(s.length()+1)/2)
        {
            return "";
        }
        char arr[] = new char[s.length()];
        int idx =0;
        for(int i= 0;i<maxFreq;i++)
        {
            arr[idx] = max;
            idx+=2;
        
        }
        map.remove(max);
        for(char key:map.keySet())
        {
            if(idx>=arr.length)
            {
                idx=1;
            }
            for(int i=0;i<map.get(key);i++)
            {
                if(idx>=arr.length)
                {
                    idx=1;
                }
                arr[idx]=key;
                idx+=2;
                
            }
        }
        return new String(arr);
    }
}