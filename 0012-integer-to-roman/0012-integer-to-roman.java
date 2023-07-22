class Solution {
    public String intToRoman(int num) {
       Map<Integer,String> map = new HashMap<>();
        
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
         map.put(9,"IX");
         map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        
        int arr[]= new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String ans ="";
        for(int i=0;i<arr.length;i++)
        {  
            while(num>=arr[i])
            {
                ans=ans+map.get(arr[i]);
                num=num-arr[i];
            }
        }
        return ans;
    }
}