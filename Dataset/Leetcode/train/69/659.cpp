class Solution {
public:
    int XXX(int x) {
        if(x < 2)      return x;
        long left = 1, right = x;
        while(left <= right){
            long mid = left + right >> 1;
            if(mid*mid == x)    return mid;
            if(mid*mid > x)     right = mid - 1;
            else left = mid + 1;
        }
        return right;
    }
};

