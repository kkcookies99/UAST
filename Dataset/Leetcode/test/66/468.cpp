class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        for (int i = digits.size() - 1; i >= 0; i--) {
            if (digits[i] == 9) digits[i] = 0;
            else {
                ++digits[i];
                break;
            }
        }
        if (digits[0] == 0) {
            digits.push_back(1);
            swap(digits.front(), digits.back());
        }
        return digits;
    }
};

