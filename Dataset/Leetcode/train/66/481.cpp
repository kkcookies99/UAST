class Solution {
public:
    vector<int> XXX(vector<int> &digits) {
        digits.back()++;
        for (int i = digits.size() - 1; i >= 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                if (i == 0)
                    digits.insert(digits.begin(), 1);
                else
                    digits[i - 1]++;
            }
            else
                break;
        }
        return digits;
    }
};

