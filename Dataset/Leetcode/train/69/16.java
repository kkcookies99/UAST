class Solution {
    public int XXX(int x) {
        //二分查找 [0, x] 之间
        int left = 0;
        int right = x;
        while(left < right){
            int mid = (left + right + 1) >>> 1;
            //注意：有案例是 2147395599，求得 mid 平方会超过 int ，因此需要将平方结果转为 long 
            if((long)mid * mid > x){
                right = mid - 1;
            }else{
                left = mid;
            }
        }
        return left;
    }
}

