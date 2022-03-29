class Solution {
public:
    int XXX(int x) {
        int left  = 0;
        int right = x;
        long long mid   = x / 2;

        while (left < right) {
            if (mid*mid == x) {
                return mid;
            }
            else if (mid*mid < x){
               left = mid + 1;
               mid  = left + (right - left) / 2; 
           } 
           else if (mid*mid > x){
               right = mid - 1;
               mid   = left + (right - left) / 2; 
           }
        }

        if (mid*mid > x)
            mid -= 1;

        return mid;
    }
};

