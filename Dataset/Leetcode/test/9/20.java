class Solution {
    public boolean XXX(int x) {
        int n = 0;
        int r = x;
        while (r > 0){
            n = n * 10 + r % 10;
            r = r / 10;
        }
        return n == x;
    }
}

