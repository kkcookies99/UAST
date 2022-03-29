class Solution {
    public int XXX(int x) {
        long r = 0;
        while(x!=0){
            int pop = x % 10;
            x = (x-pop)/10;
            r = r*10 + pop;
        }
        if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE){
            return 0;
        }
        return (int)r;
    }
}

