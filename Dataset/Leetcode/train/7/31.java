class Solution {
    public int XXX(int x) {
        long rs = 0;
        while(x != 0){
            rs = rs*10+x%10;
            x /= 10;
        }
        return (rs<Integer.MIN_VALUE || rs>Integer.MAX_VALUE) ? 0:(int)rs;
    }
}

