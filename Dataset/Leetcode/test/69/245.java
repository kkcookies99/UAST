class Solution {
    public int XXX(int x) {
        int a = x-1;
        int left = 0;
        if(x < 2){
            return x;
        }
        while(left <= a){
            int mid = (left + a) >>> 1;
            if((long)mid * mid == x){
                return mid;
            }
            if((long)mid * mid < x){
                left = mid +1; 
            }
            if((long)mid * mid > x){
                a = mid -1;
            }
        }
        return a;
    }
}

