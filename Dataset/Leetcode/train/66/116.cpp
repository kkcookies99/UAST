 class Solution {
public:
    void plus1(int index, vector<int>& digits) {
        if (index >= digits.size()) {
            digits.push_back(1);
            return;
        }
    
        if (digits[index] + 1 < 10) {
            digits[index] += 1;
            return;
        }
        digits[index] = 0;
        plus1(index + 1, digits);
    }
    vector<int> XXX(vector<int>& digits) {
        reverse(digits.begin(), digits.end());
        plus1(0, digits);
        reverse(digits.begin(), digits.end());

        return digits;
    }
};

