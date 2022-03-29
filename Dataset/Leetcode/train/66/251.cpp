 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int n = digits.size();
        int bit = 0;
        for(int i = n - 1; i >= 0; --i) {
            if(i != n - 1 && !bit) break;
            
            int y = 0;
            y = i == n - 1 ? digits[i] + 1 : digits[i] + bit;
            digits[i] = y < 10 ? y : y % 10;
            bit = y < 10 ? 0 : 1;
            if(i == 0 && bit) digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};

