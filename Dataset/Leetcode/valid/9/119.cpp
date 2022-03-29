class Solution {
public:
    bool XXX(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        long ans = 0;
        long temp = x;
        while (temp != 0) {
            ans = ans * 10 + temp % 10;
            temp /= 10;
        }
        return (int)ans == x;
    }
};

