class Solution {
    public int XXX(int x) {
        return sqrt(x, 0, x);
    }

    int sqrt(int x, int low, int high) {
        int mid = (low + high) / 2;
        if ((long)mid * mid > x) return sqrt(x, low, mid - 1);
        else if ((long)mid * mid <= x && (long)(mid + 1) * (mid + 1) > x)                
            return mid;
        return sqrt(x, mid + 1, high); 
    }
}

