class RandomizedSet {
List<Integer> al;
    public RandomizedSet() {
        al = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!al.contains(val))
        {
            al.add(val);
            return true;
        }
        else
        return false;
            
    }
    
    public boolean remove(int val) {
        if(al.contains(val))
        {
        al.remove((Integer)val);
            return true;
        }
        else
        return false;
        
    }
    
    public int getRandom() {
         Random random = new Random();
        int randomIndex = random.nextInt(al.size());

        return al.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */