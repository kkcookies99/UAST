class Solution {
    public int XXX(int x) {
        int left = 0,right = x,mid;
        while(left < right){
            mid = (left + right + 1) / 2;
            if(mid > x/mid){
                right = mid-1;
            }else{
                left = mid;
            }
        }
        return left;
    }
}

