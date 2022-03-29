class Solution {
public:
    int XXX(int x) {
        if(x==0||x==1) return x;
        long left = 0;
        long right = x;
        while(left <= right){
            long mid = floor((left + right) / 2);
            if(mid * mid > x){
                right = mid - 1;
            }else if(mid * mid < x){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return right;
    }
};

