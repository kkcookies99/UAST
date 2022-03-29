class Solution {
public:
    vector<int> XXX(vector<int> &digits)
    {
        auto it = digits.rbegin();
        for (; it != digits.rend(); it++) {
            if (*it == 9) {
                *it = 0;
            } else {
                ++(*it);
                break;
            }
        }

        if (it == digits.rend()) {
            digits.insert(digits.begin(), 1);
        }

        return digits;
    }
};

