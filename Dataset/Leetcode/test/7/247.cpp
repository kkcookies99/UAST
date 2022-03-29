class Solution {
public:
    int XXX(int x) {
        
        long result = 0;
        while (x) {
            result = result *10 + x%10;
            x/=10;
        }
        if (result != (int)result) {
            result = 0;
        }
        return result;
    }
};

