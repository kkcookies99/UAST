class Solution {
public:
    int XXX(int x) {
        int rev = 0;
        int t = 0;
        while(x)
        {
            t = x % 10;
            x /= 10;
            if(rev > INT_MAX / 10 || (rev == INT_MAX / 10 && t > 7))
                return 0;
            if(rev < INT_MIN / 10 || (rev == INT_MIN / 10 && t < -8))
                return 0;
            rev = rev * 10 + t;
        }
        return rev;
    }
};
