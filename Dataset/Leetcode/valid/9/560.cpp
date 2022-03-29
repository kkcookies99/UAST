 class Solution {
public:
     int reverse(int n) {
        int c = 0;
        int digits;
        while(n != 0)
        {
            if((c < INT_MIN / 10) || (c > INT_MAX / 10))
            {
                return 0;
            }
            int digits = n % 10;
            n /= 10;
            c = c * 10 + digits;
        }
        return c;
    }
    bool XXX(int x) {
        int reversed;
        if(x < 0)
        {
            return false;
        }
        reversed = reverse(x);
        if(x == reversed)
        {
            return true;
        } else
        {
            return false;
        }
    }
};

