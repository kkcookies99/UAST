 class Solution {
public:
    vector<int> XXX(vector<int> &digits) {
        int n = digits.size();
        int flag = 1;

        for (int i = n - 1; (i >= 0) && (flag == 1); --i) {
            int sum = digits[i] + flag;
            if (sum > 9) {
                flag = 1;
                digits[i] = sum - 10;
            } else {
                digits[i] = sum;
                flag = 0;
            }
        }

        if (flag) {
            digits.insert(digits.begin(), 1);
        }

        return digits;

    }
};

