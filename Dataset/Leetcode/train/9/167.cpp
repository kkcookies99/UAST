class Solution {
public:
    bool XXX(int x) {
        if(x < 0) return false;
        int t = x;
        unsigned int sum = 0;
        while(t != 0)
        {
            sum = sum * 10 + t % 10;
            t /= 10;
        }
        return sum == x;
    }
};

