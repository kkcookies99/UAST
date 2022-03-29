 class Solution {
public:
    bool XXX(int x) {
        if (x < 0) {
            return false;
        } else if (!x) {
            return true;
        }
        int length = 0, xTemp = x;
    
        for (; xTemp > 0; ++length) {
            xTemp /= 10;
        }
        int times = length / 2;
        bool isOdd = !(length % 2);
        for (; times > 0; --times) {
            int temp = (int)pow(10, times * 2 - isOdd);
            if ((x / temp) != (x % 10)) {
                return false;
            }
            x -= (temp * (x / temp));
            x /= 10;
        }
        return true;
    }
};

