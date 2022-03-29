 class Solution {
    public boolean XXX(int x) {
        if(x < 0){
            return false;
        }
        int num = x;
        long n = 0;
        while (x != 0){
            n = n * 10 + x % 10;
            x /= 10;
        }
        return num == (int) n;
    }
}

