class Solution {
    public int minCostToMoveChips(int[] position) {
        int n = position.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(position[i],map.getOrDefault(position[i],0)+1);
            
        }
        
        int valo = 0;
        int vale =0;
        
      
        for(int key:map.keySet())
        {
               if(key%2==0)
               {
                   vale+=map.get(key);
               }
            else
            {
                valo+=map.get(key);
            }
        }
            if(valo>vale)
            {
                return vale;
            }
            return valo;    
        
        
    }
}