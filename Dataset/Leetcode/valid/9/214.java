class Solution {
    public boolean XXX(int x) {
        if(x < 0) return false;
        int y = 0;
        int z = x;
        while(z > 0){
            int j = z%10;
            y = y * 10 + j;
            z = z/10;
        }
        return y == x;
    }
}

