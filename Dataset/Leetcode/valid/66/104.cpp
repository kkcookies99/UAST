 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        for (int i = digits.size() - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits[0] = 1;
        digits.push_back(0);
        return digits;
    }
};

