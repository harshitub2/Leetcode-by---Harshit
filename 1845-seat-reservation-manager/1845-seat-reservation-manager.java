class SeatManager {
    TreeSet<Integer> set = new TreeSet<>();
    
    public SeatManager(int n) {
        for(int i=1;i<=n;i++)
        {
            set.add(i);
        }
    }
    
    public int reserve() {
        int seat = set.pollFirst();
        return seat;
    }
    
    public void unreserve(int seatNumber) {
        set.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */