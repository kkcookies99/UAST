 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int carry = 1;
        for (auto it = digits.rbegin(); it < digits.rend(); ++it) {
            int temp = *it;
            *it = (temp + carry) % 10;
            carry = (temp + carry) / 10;
        }
        if (carry)
            digits.insert(digits.begin(), carry);
        return digits;
    }
};

