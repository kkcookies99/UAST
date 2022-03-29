class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        reverse(digits.begin(), digits.end());
        int add = 1;
        for (int i = 0; i < digits.size(); ++i)
        {
            digits[i] += add;
            if (digits[i] >= 10) add = 1, digits[i] -= 10;
            else add = 0;
        }
        if (add) digits.push_back(add);
        reverse(digits.begin(), digits.end());
        return digits;
    }
};

