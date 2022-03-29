class Solution {
    public int XXX(int x) {
        int left = 0, right = x;
        int mid;
        if(0 == x || 1 == x){
            return x;
        }
        while(left<right){
            mid = (left+right)/2;
            if(mid  > x/mid){
                right = mid;
            }else{
                if(left == mid){
                    return left;
                }
                left = mid;
            }
        }
        return left;
    }
}

