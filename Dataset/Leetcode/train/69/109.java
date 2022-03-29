class Solution {
    public int XXX(int x) {
        if(x == 1 || x == 0) {
            return x;
        }
        int left = 0;
        int right = x;
        int mid = 0;
        while(left <= right) {
            mid = left + (right -left) / 2;
            if(mid > x / mid) {
                right = mid -1;
            } else if(mid < x /mid) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}

