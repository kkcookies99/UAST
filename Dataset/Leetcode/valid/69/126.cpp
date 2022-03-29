class Solution {
public:
    int binary(long left, long right, int x)
    {
        long mid;
        while(left <= right)
        {
            mid = (left + right) / 2;
            if(mid * mid > x)
                right = mid - 1;
            else if(mid * mid < x)
                left = mid + 1;
            else
                return mid;
        }
        if(left * left < x)
            return left;
        else
            return left - 1;
    }
    
    int XXX(int x) {
        return binary(0, x, x); 
    }
};