class Solution {
    public int XXX(int x) {
        if (x == 0) {
            return 0;
        }
        int low = 0;
        int high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if((long) mid*mid > x) {
                high = mid - 1;
            }else if((long) mid*mid < x) {
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return low - 1;
    }
}

