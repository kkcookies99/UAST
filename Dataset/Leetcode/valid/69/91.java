class Solution {
    public int XXX(int x) {
        int left = 0, right = x;
        while(left < right){
            long mid = ((long) right - left + 1) / 2 + left;
            if(mid * mid > x){
                right = (int)mid - 1;
            }
            else{
                left = (int)mid;
            }
        }
        return left;
    }
}

