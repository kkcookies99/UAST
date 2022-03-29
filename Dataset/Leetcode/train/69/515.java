class Solution {
    public int XXX(int x) {
        if(x < 2)
            return x;
        int res = 0;
        //二分法
        int left = 1, right = x, mid = 0;
        while(left < right) {
            mid = left + (right - left) / 2;
            if(x/mid < mid) {
                right = mid - 1;
            } else if(x/mid > mid) {
                left = mid + 1;
            } else if(x/mid == mid)
                return mid;
        }
        return x/left < left ? left-1 : left;
    }
}

