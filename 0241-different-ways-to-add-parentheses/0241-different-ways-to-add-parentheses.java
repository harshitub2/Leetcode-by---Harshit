class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
    for(int i=0;i<expression.length();i++)
    {
        if(expression.charAt(i)=='+' || expression.charAt(i)=='-' || expression.charAt(i)=='*')
        {
            String p1 = expression.substring(0,i);
            String p2 = expression.substring(i+1);
            
            List<Integer> part1 = diffWaysToCompute(p1);
            List<Integer> part2 = diffWaysToCompute(p2);
            
            for(int pp1:part1)
            {
                for(int pp2:part2)
                {
                    int c = 0;
                    switch(expression.charAt(i))
                    {
                            case'+':
                            c=pp1+pp2;
                            break;
                            case'-':
                            c=pp1-pp2;
                            break;
                            case'*':
                            c=pp1*pp2;
                            break;
                    }
                    res.add(c);
                }
            }
        }
    }
        if(res.isEmpty())
        {
            res.add(Integer.parseInt(expression));
        }
        return res;
    }
}