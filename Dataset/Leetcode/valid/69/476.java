class Solution {
    public int XXX(int x) {
        int left = 0;
        int right = x;
        int result = -1;
        while(right >= left){
            int mid = left + (right - left) / 2;
            long midSquare = (long) mid * mid;
            if(midSquare > x){
                right = mid - 1;
            }
            else{
                result = mid;
                left = mid + 1;
            }
        }
        return result;
    }
}

