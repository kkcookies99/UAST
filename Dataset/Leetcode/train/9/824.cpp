 class Solution {
public:
    bool XXX(int x) {
        if (x < 0|| (x % 10 == 0 && x != 0))return false;
        long revRes = 0;
        int srcRes = x;
        while (x != 0) {
            int val = x % 10;
            revRes = revRes * 10 + val;
            x /= 10;
        }
        return revRes == srcRes;
    }
};

