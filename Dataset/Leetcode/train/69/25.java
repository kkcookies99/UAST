class Solution {
    public int XXX(int x) {
        if(x == 0) return 0;
        //二分查找的方法
        long left = 1, right = x;
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(mid * mid > x && (mid - 1) * (mid - 1) < x){
                return (int)mid - 1;
            }else if (mid * mid == x){
                return (int)mid;
            } else if(x < mid * mid){
                right = mid - 1;
            }else if(x > mid * mid){
                left = mid + 1;
            }
        }
        return -1;
    }
}

