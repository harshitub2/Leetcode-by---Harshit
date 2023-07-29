/*class Solution {
    public double soupServings(int n) {
        double ans = func(n,n);
        return ans;
        
    }
    double func(int a,int b)
    {
        double ans =0;
        if(a<=0 && b<=0)
            return 0.5;
        else if(b<=0)
            return 0;
        else if(a<=0)
            return 1;
        
        ans+=0.25*func(a-100,b-0);
        ans+=0.25*func(a-75,b-25);
        ans+=0.25*func(a-50,b-50);
        ans+=0.25*func(a-25,b-75);
        return ans;
    }
}*/
class Solution {
    public double soupServings(int n) {
        if(n>5000)
            return 1;
         Map<String,Double> map= new HashMap<>();
        double ans = function(n,n,map);
       
        return ans;
    }


    public double function(int soup_a,int soup_b, Map<String,Double> map){

        if(soup_a<=0 && soup_b<=0) return 0.5;
        if(soup_a<=0) return 1.0;
        if(soup_b<=0) return 0.0;
            String key = soup_a + "-"+ soup_b;
        if(map.containsKey(key))
            return map.get(key);
        double prob = 0.0;
        prob += 0.25*function(soup_a-100,soup_b,map);
        prob += 0.25*function(soup_a-75,soup_b-25,map);
        prob += 0.25*function(soup_a-50,soup_b-50,map);
        prob += 0.25*function(soup_a-25,soup_b-75,map);
            map.put(key,prob);
        return prob;
    }

}