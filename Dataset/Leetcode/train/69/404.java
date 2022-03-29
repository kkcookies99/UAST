class Solution {
    public int XXX(int x) {
        if(x==0){
            return x;
        }
        int left = 1;
        int right = x;
        
        while(left <= right) {
            int mid = left + ((right - left) >> 1);
            if(mid > x / mid) {
                right = mid - 1;
            }else if(mid < x / mid) {
                left = mid + 1;
            }else if(mid == x / mid) {
                return mid;
            }
        }

        return right;
    }
}

