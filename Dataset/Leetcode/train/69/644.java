class Solution {
    public int XXX(int x) {
        int left = 1;
        int right = x;
        int mid;
        if(x == 0 || x == 1){
            return x;
        }
        while(left <= right){
            mid = left + (right - left) / 2;
            if(x / mid == mid){
                return mid;
            }else if(x / mid < mid){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }
}

