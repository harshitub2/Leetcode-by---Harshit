class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> ar = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(String n:arr)
        {
            if(map.get(n)<2)
            {
                ar.add(n);
            }
        }
        if(k>0 && ar.size()>=k)
        return ar.get(k-1);
        return "";
    }
}