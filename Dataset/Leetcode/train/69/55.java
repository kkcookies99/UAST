class Solution {
    public int XXX(int x) {
        if (x == 0) {
            return x;
        }
        int low = 1;
        int high = x;
        while (low < high - 1) {
            int mid = (low + high) >> 1;
            if (x / mid > mid) {
                low = mid;
            } else if (x / mid < mid) {
                high = mid;
            } else {
                return mid;
            }

        }
        return low;
    }
}

