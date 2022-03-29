class Solution {
    public int XXX(int x) {
        int left = 0,right = x;
        if(x>46341) right = 46340;
        while(left <= right){
            int mid = (left+right)/2;
            if(mid*mid > x){
                right = mid-1;
            }else if(mid * mid < x){
                left = mid+1;
            }else{
                return mid;
            }
        }
        return Math.min(left,right);
        //return (int)Math.sqrt(x);
    }
}

