 class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        bool flag = true;
        for (int i = digits.size() - 1; i >= 0 && flag; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                flag = false;
            }
        }
        if (flag) digits.insert(digits.begin(), 1);
        return digits;
    }
};

