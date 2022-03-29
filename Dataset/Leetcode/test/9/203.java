class Solution {
    public boolean XXX(int x) {
        if (x < 0){
            return false;
        }
        int z = x;
        int n = 0;
        while (x != 0){
            n = n * 10 + x % 10;
            x /= 10;
        }

        return z == n;
    }
}

